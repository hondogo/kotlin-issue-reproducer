package test.plugin

import org.jetbrains.kotlin.DeprecatedForRemovalCompilerApi
import org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext
import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext
import org.jetbrains.kotlin.compiler.plugin.CompilerPluginRegistrar
import org.jetbrains.kotlin.compiler.plugin.ExperimentalCompilerApi
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.descriptors.DescriptorVisibilities
import org.jetbrains.kotlin.ir.IrStatement
import org.jetbrains.kotlin.ir.builders.declarations.addValueParameter
import org.jetbrains.kotlin.ir.builders.declarations.buildFun
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin
import org.jetbrains.kotlin.ir.declarations.IrFile
import org.jetbrains.kotlin.ir.declarations.IrFunction
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin
import org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl
import org.jetbrains.kotlin.ir.expressions.impl.IrFunctionExpressionImpl
import org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl
import org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl
import org.jetbrains.kotlin.ir.symbols.UnsafeDuringIrConstructionAPI
import org.jetbrains.kotlin.ir.types.typeOrFail
import org.jetbrains.kotlin.ir.types.typeWith
import org.jetbrains.kotlin.ir.util.dump
import org.jetbrains.kotlin.ir.util.functions
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.SpecialNames

@ExperimentalCompilerApi
class TestComponentRegistrar : CompilerPluginRegistrar() {

    override val supportsK2: Boolean
        get() = true

    override fun ExtensionStorage.registerExtensions(
        configuration: CompilerConfiguration
    ) {
        IrGenerationExtension.registerExtension(
            object : IrGenerationExtension {
                override fun generate(
                    moduleFragment: IrModuleFragment,
                    pluginContext: IrPluginContext
                ) {
                    apply(
                        moduleFragment = moduleFragment,
                        pluginContext = pluginContext
                    )
                }
            }
        )
    }

    @OptIn(UnsafeDuringIrConstructionAPI::class, DeprecatedForRemovalCompilerApi::class)
    private fun apply(
        moduleFragment: IrModuleFragment,
        pluginContext: IrPluginContext
    ) {
        val factory = pluginContext.irFactory
        val builtins = pluginContext.irBuiltIns
        val globalClass = pluginContext.referenceClass(ClassId.topLevel(FqName("test.module1.Global")))!!.owner
        val globalTestFun = globalClass.functions.single { it.name.identifierOrNullIfSpecial == "test" }
        val globalContextClass = pluginContext.referenceClass(ClassId.topLevel(FqName("test.module1.GlobalContext")))!!.owner
        val globalContextTestFun = globalContextClass.functions.single { it.name.identifierOrNullIfSpecial == "test" }
        moduleFragment.transform(object : IrElementTransformerVoidWithContext() {
            override fun visitFunctionNew(declaration: IrFunction): IrStatement {
                if (declaration.name.identifierOrNullIfSpecial == "test1") {
                    declaration.body = factory.createBlockBody(-1, -1).apply {
                        statements.add(
                            IrCallImpl(
                                startOffset = -1,
                                endOffset = -1,
                                type = builtins.unitType,
                                symbol = globalTestFun.symbol
                            ).apply {
                                dispatchReceiver = IrGetObjectValueImpl(
                                    startOffset = -1,
                                    endOffset = -1,
                                    type = globalClass.typeWith(),
                                    symbol = globalClass.symbol
                                )
                                putValueArgument(
                                    index = 0,
                                    valueArgument = IrFunctionExpressionImpl(
                                        startOffset = -1,
                                        endOffset = -1,
                                        function = factory.buildFun {
                                            origin = IrDeclarationOrigin.LOCAL_FUNCTION_FOR_LAMBDA
                                            name = SpecialNames.ANONYMOUS
                                            returnType = builtins.unitType
                                            visibility = DescriptorVisibilities.LOCAL
                                        }.apply {
                                            parent = declaration
                                            addValueParameter(
                                                name = SpecialNames.ANONYMOUS,
                                                type = globalContextClass.typeWith()
                                            )
                                            val lambda = this
                                            body = factory.createBlockBody(-1, -1).apply {
                                                statements.add(
                                                    IrCallImpl(
                                                        startOffset = -1,
                                                        endOffset = -1,
                                                        type = builtins.unitType,
                                                        symbol = globalContextTestFun.symbol
                                                    ).apply {
                                                        dispatchReceiver = IrGetValueImpl(
                                                            startOffset = -1,
                                                            endOffset = -1,
                                                            symbol = lambda.valueParameters.first().symbol
                                                        )
                                                    }
                                                )
                                            }
                                        },
                                        type = globalTestFun.valueParameters[0].type,
                                        origin = IrStatementOrigin.LAMBDA
                                    )
                                )
                            }
                        )
                    }
                }
                return super.visitFunctionNew(declaration)
            }
        }, null)
    }
}