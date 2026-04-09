### Compilation fails for Js and WasmJs targets, but compiles successfully for Jvm target

Starting from Kotlin 2.4.0-Beta1


`./gradlew jsBrowserDevelopmentRun`

or

`./gradlew wasmJsBrowserDevelopmentRun`

Fail message (for Js and WasmJs targets):

```  
org.jetbrains.kotlin.backend.common.CompilationException: Back-end: Please report this problem https://kotl.in/issue
/home/kotlin-issue-reproducer/module2/src/commonMain/kotlin/module2/lib.kt:14:1
Problem with `@Composable
@FunctionKeyMeta(key = -1384232119, startOffset = 390, endOffset = 565)
fun <E : Any?> Test1(arg: E?, /* var */ $composer: Composer?, $changed: Int) {
  var $composer: Composer? = $composer
  { // BLOCK
    $composer = $composer.startRestartGroup(key = -1384232119)
    sourceInformation(composer = $composer, sourceInformation = "C(Test1)19@509L54,16@425L138:lib.kt#kas5za")
  }
  val $dirty: Int = $changed
  when {
    EQEQ(arg0 = $changed.and(other = 6), arg1 = 0) -> $dirty = $dirty.or(other = when {
      when {
        EQEQ(arg0 = $changed.and(other = 8), arg1 = 0) -> $composer.changed(value = arg)
        true -> $composer.changedInstance(value = arg)
      } -> 4
      true -> 2
    })
  }
  when {
    $composer.shouldExecute(parametersChanged = EQEQ(arg0 = $dirty.and(other = 3), arg1 = 2).not(), flags = $dirty.and(other = 1)) -> { // BLOCK
      when {
        isTraceInProgress() -> traceEventStart(key = -1384232119, dirty1 = $dirty, dirty2 = -1, info = "module2.Test1 (lib.kt:15)")
      }
      { // BLOCK
        val tmp0_properties: PopupProperties = PopupProperties()
        Popup(alignment = // COMPOSITE {
        null
        // }, offset = // COMPOSITE {
        IntOffset(packedValue = 0L)
        // }, onDismissRequest = Function0<Unit>(
          /* bound = */ [],
          /* invoke = */          local fun() {
            return Unit
          }
        )
, properties = tmp0_properties, content = run<Function2<Composer, Int, Unit>>(block = Function0<Function2<Composer, Int, Unit>>(
          /* bound = */ [],
          /* invoke = */          local inline fun(): Function2<Composer, Int, Unit> {
            val dispatchReceiver: ComposableLambda = rememberComposableLambda(key = 498819052, tracked = true, block = Function2<Composer, Int, Unit>(
              /* bound = */ [],
              /* invoke = */              @Composable
              @FunctionKeyMeta(key = 498819052, startOffset = 509, endOffset = 563)
              local fun(/* var */ $composer: Composer?, $changed: Int) {
                var $composer: Composer? = $composer
                sourceInformation(composer = $composer, sourceInformation = "C20@519L38:lib.kt#kas5za")
                when {
                  $composer.shouldExecute(parametersChanged = EQEQ(arg0 = $changed.and(other = 3), arg1 = 2).not(), flags = $changed.and(other = 1)) -> { // BLOCK
                    when {
                      isTraceInProgress() -> traceEventStart(key = 498819052, dirty1 = $changed, dirty2 = -1, info = "module2.Test1.<anonymous> (lib.kt:20)")
                    }
                    { // BLOCK
                      val tmp0: Any? = arg /*as Any? */
                      val tmp2: Composer? = $composer
                      val tmp4: Int = 8.and(other = $dirty)
                      { // RETURNABLE BLOCK
                        { // INLINED FUNCTION BLOCK
                          val arg: Any? = tmp0
                          val $composer: Composer? = tmp2
                          val $changed: Int = tmp4
                          var $composer: Composer? = $composer
                          sourceInformationMarkerStart(composer = $composer, key = 900631336, sourceInformation = "CC(Test2)32@653L222:lib.kt#kas5za")
                          LazyColumn(modifier = // COMPOSITE {
                          null
                          // }, state = // COMPOSITE {
                          null
                          // }, contentPadding = // COMPOSITE {
                          null
                          // }, reverseLayout = // COMPOSITE {
                          false
                          // }, verticalArrangement = // COMPOSITE {
                          null
                          // }, horizontalAlignment = // COMPOSITE {
                          null
                          // }, flingBehavior = // COMPOSITE {
                          null
                          // }, userScrollEnabled = // COMPOSITE {
                          false
                          // }, overscrollEffect = // COMPOSITE {
                          null
                          // }, content = @ExtensionFunctionType Function1<LazyListScope, Unit>(
                            /* bound = */ [],
                            /* invoke = */                            local fun($this$LazyColumn: LazyListScope) {
                              { // BLOCK
                                val x: Any?

                                  local get($x$delegate: MutableState<Any?>): Any? {
                                    return getValue<Any?>(/* <this> = $x$delegate, */ thisObj = null, property = KProperty0<Any?>(
                                      /* bound = */ [],
                                      /* getter = */                                      local fun(): Nothing {
                                        throwUnsupportedOperationException(message = "Not supported for local property reference.")
                                      }
                                    )
)
                                  }

                                items<Any?>(/* <this> = $this$LazyColumn, */ items = emptyList<Any?>(), itemContent = @ExtensionFunctionType Function4<LazyItemScope, Any?, Composer, Int, Unit>(
                                  /* bound = */ [],
                                  /* invoke = */                                  @Composable
                                  @FunctionKeyMeta(key = -976271980, startOffset = 727, endOffset = 869)
                                  local fun($this$items: LazyItemScope, it: Any?, /* var */ $composer: Composer?, $changed: Int) {
                                    var $composer: Composer? = $composer
                                    { // BLOCK
                                      { // BLOCK
                                        $composer.startReplaceGroup(key = 1399989881)
                                        sourceInformation(composer = $composer, sourceInformation = "C*36@754L105:lib.kt#kas5za")
                                      }
                                      // COMPOSITE {
                                      val x$delegate: MutableState<Any?> = { // BLOCK
                                        sourceInformationMarkerStart(composer = $composer, key = -1894501283, sourceInformation = "CC(remember):lib.kt#9igjgp")
                                        val tmp0_group: MutableState<Any?> = cache<MutableState<Any?>>(/* <this> = $composer, */ invalid = false, block = Function0<MutableState<Any?>>(
                                          /* bound = */ [],
                                          /* invoke = */                                          local fun(): MutableState<Any?> {
                                            return mutableStateOf<Any?>(value = null)
                                          }
                                        )
)
                                        sourceInformationMarkerEnd(composer = $composer)
                                        tmp0_group
                                      }
                                      // }
                                      $composer.endReplaceGroup()
                                    }
                                  }
                                )
)
                              }
                            }
                          )
, $composer = $composer, $changed = 805306368, $default = 511)
                          sourceInformationMarkerEnd(composer = $composer)
                          return Unit
                        }
                      }
                    }
                    when {
                      isTraceInProgress() -> traceEventEnd()
                    }
                  }
                  true -> $composer.skipToGroupEnd()
                }
              }
            )
, $composer = $composer, $changed = 54)
            return remember<Function2<Composer, Int, Unit>>(key1 = dispatchReceiver, calculation = Function0<Function2<Composer, Int, Unit>>(
              /* bound = */ [],
              /* invoke = */              local inline fun(): Function2<Composer, Int, Unit> {
                return Function2<Composer, Int, Unit>(
                  /* bound = */ [dispatchReceiver],
                  /* invoke = */                  local fun(<this>: ComposableLambda, p0: Composer, p1: Int) {
                    return <this> /*as Function2<Composer, Int, Any?> */.invoke(p1 = p0, p2 = p1) /*as Unit */
                  }
                )

              }
            )
, $composer = $composer, $changed = 0)
          }
        )
), $composer = $composer, $changed = 28032, $default = 3)
      }
      when {
        isTraceInProgress() -> traceEventEnd()
      }
    }
    true -> $composer.skipToGroupEnd()
  }
  { // BLOCK
    { // BLOCK
      val tmp0_safe_receiver: ScopeUpdateScope? = $composer.endRestartGroup()
      when {
        EQEQ(arg0 = tmp0_safe_receiver, arg1 = null) -> null
        true -> tmp0_safe_receiver.updateScope(block = Function2<Composer?, Int, Unit>(
          /* bound = */ [],
          /* invoke = */          local fun($composer: Composer?, $force: Int) {
            return Test1<E>(arg = arg, $composer = $composer, $changed = updateChangedFlags(flags = $changed.or(other = 1)))
          }
        )
)
      }
    }
  }
}

`
Details: Internal error in body lowering: java.lang.IllegalStateException: Local delegated property LOCAL_DELEGATED_PROPERTY name:x type:kotlin.Any? flags:val has not delegate
	at org.jetbrains.kotlin.backend.common.lower.inline.LocalClassesInInlineLambdasLowering$lower$1$visitCall$2.visitLocalDelegatedProperty(LocalClasses.kt:149)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitLocalDelegatedProperty(IrElementTransformerVoid.kt:99)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitLocalDelegatedProperty(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty.accept(IrLocalDelegatedProperty.kt:50)
	at org.jetbrains.kotlin.ir.IrElementBase.transform(IrElementBase.kt:33)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlace(transform.kt:35)
	at org.jetbrains.kotlin.ir.expressions.IrContainerExpression.transformChildren(IrContainerExpression.kt:26)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitExpression(IrElementTransformerVoid.kt:166)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitContainerExpression(IrElementTransformerVoid.kt:248)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlock(IrElementTransformerVoid.kt:254)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlock(IrElementTransformerVoid.kt:257)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlock(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrBlock.accept(IrBlock.kt:18)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlace(transform.kt:35)
	at org.jetbrains.kotlin.ir.expressions.IrBlockBody.transformChildren(IrBlockBody.kt:27)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBody(IrElementTransformerVoid.kt:174)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlockBody(IrElementTransformerVoid.kt:188)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlockBody(IrElementTransformerVoid.kt:191)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlockBody(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrBlockBody.accept(IrBlockBody.kt:20)
	at org.jetbrains.kotlin.ir.expressions.IrBody.transform(IrBody.kt:20)
	at org.jetbrains.kotlin.ir.declarations.IrFunction.transformChildren(IrFunction.kt:293)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt.transformChildrenVoid(IrElementTransformerVoid.kt:589)
	at org.jetbrains.kotlin.backend.common.lower.inline.LocalClassesInInlineLambdasLowering$lower$1$visitCall$2.visitRichFunctionReference(LocalClasses.kt:159)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitRichFunctionReference(IrElementTransformerVoid.kt:341)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitRichFunctionReference(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrRichFunctionReference.accept(IrRichFunctionReference.kt:141)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlaceNullable(transform.kt:46)
	at org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression.transformChildren(IrMemberAccessExpression.kt:520)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitExpression(IrElementTransformerVoid.kt:166)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitDeclarationReference(IrElementTransformerVoid.kt:194)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitMemberAccess(IrElementTransformerVoid.kt:200)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitFunctionAccess(IrElementTransformerVoid.kt:206)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitCall(IrElementTransformerVoid.kt:302)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitCall(IrElementTransformerVoid.kt:305)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitCall(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrCall.accept(IrCall.kt:24)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlace(transform.kt:35)
	at org.jetbrains.kotlin.ir.expressions.IrContainerExpression.transformChildren(IrContainerExpression.kt:26)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitExpression(IrElementTransformerVoid.kt:166)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitContainerExpression(IrElementTransformerVoid.kt:248)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlock(IrElementTransformerVoid.kt:254)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitInlinedFunctionBlock(IrElementTransformerVoid.kt:272)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitInlinedFunctionBlock(IrElementTransformerVoid.kt:275)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitInlinedFunctionBlock(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrInlinedFunctionBlock.accept(IrInlinedFunctionBlock.kt:34)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlace(transform.kt:35)
	at org.jetbrains.kotlin.ir.expressions.IrContainerExpression.transformChildren(IrContainerExpression.kt:26)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitExpression(IrElementTransformerVoid.kt:166)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitContainerExpression(IrElementTransformerVoid.kt:248)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlock(IrElementTransformerVoid.kt:254)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitReturnableBlock(IrElementTransformerVoid.kt:266)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitReturnableBlock(IrElementTransformerVoid.kt:269)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitReturnableBlock(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrReturnableBlock.accept(IrReturnableBlock.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlace(transform.kt:35)
	at org.jetbrains.kotlin.ir.expressions.IrContainerExpression.transformChildren(IrContainerExpression.kt:26)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitExpression(IrElementTransformerVoid.kt:166)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitContainerExpression(IrElementTransformerVoid.kt:248)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlock(IrElementTransformerVoid.kt:254)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlock(IrElementTransformerVoid.kt:257)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlock(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrBlock.accept(IrBlock.kt:18)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlace(transform.kt:35)
	at org.jetbrains.kotlin.ir.expressions.IrContainerExpression.transformChildren(IrContainerExpression.kt:26)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitExpression(IrElementTransformerVoid.kt:166)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitContainerExpression(IrElementTransformerVoid.kt:248)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlock(IrElementTransformerVoid.kt:254)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlock(IrElementTransformerVoid.kt:257)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlock(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrBlock.accept(IrBlock.kt:18)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrBranch.transformChildren(IrBranch.kt:37)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBranch(IrElementTransformerVoid.kt:572)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBranch(IrElementTransformerVoid.kt:577)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBranch(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrBranch.accept(IrBranch.kt:25)
	at org.jetbrains.kotlin.ir.expressions.IrBranch.transform(IrBranch.kt:28)
	at org.jetbrains.kotlin.ir.expressions.IrBranch.transform(IrBranch.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlace(transform.kt:35)
	at org.jetbrains.kotlin.ir.expressions.IrWhen.transformChildren(IrWhen.kt:31)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitExpression(IrElementTransformerVoid.kt:166)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitWhen(IrElementTransformerVoid.kt:566)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitWhen(IrElementTransformerVoid.kt:569)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitWhen(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrWhen.accept(IrWhen.kt:24)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlace(transform.kt:35)
	at org.jetbrains.kotlin.ir.expressions.IrBlockBody.transformChildren(IrBlockBody.kt:27)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBody(IrElementTransformerVoid.kt:174)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlockBody(IrElementTransformerVoid.kt:188)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlockBody(IrElementTransformerVoid.kt:191)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlockBody(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrBlockBody.accept(IrBlockBody.kt:20)
	at org.jetbrains.kotlin.ir.expressions.IrBody.transform(IrBody.kt:20)
	at org.jetbrains.kotlin.ir.declarations.IrFunction.transformChildren(IrFunction.kt:293)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt.transformChildrenVoid(IrElementTransformerVoid.kt:589)
	at org.jetbrains.kotlin.backend.common.lower.inline.LocalClassesInInlineLambdasLowering$lower$1$visitCall$2.visitRichFunctionReference(LocalClasses.kt:159)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitRichFunctionReference(IrElementTransformerVoid.kt:341)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitRichFunctionReference(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrRichFunctionReference.accept(IrRichFunctionReference.kt:141)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlaceNullable(transform.kt:46)
	at org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression.transformChildren(IrMemberAccessExpression.kt:520)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitExpression(IrElementTransformerVoid.kt:166)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitDeclarationReference(IrElementTransformerVoid.kt:194)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitMemberAccess(IrElementTransformerVoid.kt:200)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitFunctionAccess(IrElementTransformerVoid.kt:206)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitCall(IrElementTransformerVoid.kt:302)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitCall(IrElementTransformerVoid.kt:305)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitCall(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrCall.accept(IrCall.kt:24)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.declarations.IrVariable.transformChildren(IrVariable.kt:43)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitDeclaration(IrElementTransformerVoid.kt:40)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitVariable(IrElementTransformerVoid.kt:140)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitVariable(IrElementTransformerVoid.kt:143)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitVariable(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.declarations.IrVariable.accept(IrVariable.kt:36)
	at org.jetbrains.kotlin.ir.IrElementBase.transform(IrElementBase.kt:33)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlace(transform.kt:35)
	at org.jetbrains.kotlin.ir.expressions.IrBlockBody.transformChildren(IrBlockBody.kt:27)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBody(IrElementTransformerVoid.kt:174)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlockBody(IrElementTransformerVoid.kt:188)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlockBody(IrElementTransformerVoid.kt:191)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid.visitBlockBody(IrElementTransformerVoid.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrBlockBody.accept(IrBlockBody.kt:20)
	at org.jetbrains.kotlin.ir.expressions.IrBody.transform(IrBody.kt:20)
	at org.jetbrains.kotlin.ir.declarations.IrFunction.transformChildren(IrFunction.kt:293)
	at org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt.transformChildrenVoid(IrElementTransformerVoid.kt:589)
	at org.jetbrains.kotlin.backend.common.lower.inline.LocalClassesInInlineLambdasLowering$lower$1.visitCall(LocalClasses.kt:98)
	at org.jetbrains.kotlin.backend.common.lower.inline.LocalClassesInInlineLambdasLowering$lower$1.visitCall(LocalClasses.kt:47)
	at org.jetbrains.kotlin.ir.expressions.IrCall.accept(IrCall.kt:24)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlaceNullable(transform.kt:46)
	at org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression.transformChildren(IrMemberAccessExpression.kt:520)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitExpression(IrTransformer.kt:95)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitDeclarationReference(IrTransformer.kt:111)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitMemberAccess(IrTransformer.kt:114)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitFunctionAccess(IrTransformer.kt:117)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitCall(IrTransformer.kt:165)
	at org.jetbrains.kotlin.backend.common.lower.inline.LocalClassesInInlineLambdasLowering$lower$1.visitCall(LocalClasses.kt:54)
	at org.jetbrains.kotlin.backend.common.lower.inline.LocalClassesInInlineLambdasLowering$lower$1.visitCall(LocalClasses.kt:47)
	at org.jetbrains.kotlin.ir.expressions.IrCall.accept(IrCall.kt:24)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlace(transform.kt:35)
	at org.jetbrains.kotlin.ir.expressions.IrContainerExpression.transformChildren(IrContainerExpression.kt:26)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitExpression(IrTransformer.kt:95)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitContainerExpression(IrTransformer.kt:138)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitBlock(IrTransformer.kt:141)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitBlock(IrTransformer.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrBlock.accept(IrBlock.kt:18)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlace(transform.kt:35)
	at org.jetbrains.kotlin.ir.expressions.IrContainerExpression.transformChildren(IrContainerExpression.kt:26)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitExpression(IrTransformer.kt:95)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitContainerExpression(IrTransformer.kt:138)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitBlock(IrTransformer.kt:141)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitBlock(IrTransformer.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrBlock.accept(IrBlock.kt:18)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrBranch.transformChildren(IrBranch.kt:37)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitBranch(IrTransformer.kt:303)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitBranch(IrTransformer.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrBranch.accept(IrBranch.kt:25)
	at org.jetbrains.kotlin.ir.expressions.IrBranch.transform(IrBranch.kt:28)
	at org.jetbrains.kotlin.ir.expressions.IrBranch.transform(IrBranch.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlace(transform.kt:35)
	at org.jetbrains.kotlin.ir.expressions.IrWhen.transformChildren(IrWhen.kt:31)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitExpression(IrTransformer.kt:95)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitWhen(IrTransformer.kt:300)
	at org.jetbrains.kotlin.ir.visitors.IrTransformer.visitWhen(IrTransformer.kt:19)
	at org.jetbrains.kotlin.ir.expressions.IrWhen.accept(IrWhen.kt:24)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:23)
	at org.jetbrains.kotlin.ir.expressions.IrExpression.transform(IrExpression.kt:19)
	at org.jetbrains.kotlin.ir.util.TransformKt.transformInPlace(transform.kt:35)
	at org.jetbrains.kotlin.ir.expressions.IrBlockBody.transformChildren(IrBlockBody.kt:27)
	at org.jetbrains.kotlin.backend.common.lower.inline.LocalClassesInInlineLambdasLowering.lower(LocalClasses.kt:47)
	at org.jetbrains.kotlin.backend.common.BodyLoweringVisitor.visitBody$lambda$0(Lower.kt:187)
	at org.jetbrains.kotlin.ir.backend.js.WholeWorldStageController.restrictTo(WholeWorldStageController.kt:29)
	at org.jetbrains.kotlin.backend.common.BodyLoweringVisitor.visitBody(Lower.kt:186)
	at org.jetbrains.kotlin.backend.common.BodyLoweringVisitor.visitBody(Lower.kt:165)
	at org.jetbrains.kotlin.ir.visitors.IrVisitor.visitBlockBody(IrVisitor.kt:92)
	at org.jetbrains.kotlin.ir.expressions.IrBlockBody.accept(IrBlockBody.kt:20)
	at org.jetbrains.kotlin.ir.declarations.IrFunction.acceptChildren(IrFunction.kt:287)
	at org.jetbrains.kotlin.backend.common.BodyLoweringVisitor.visitDeclaration(Lower.kt:174)
	at org.jetbrains.kotlin.backend.common.BodyLoweringVisitor.visitDeclaration(Lower.kt:165)
	at org.jetbrains.kotlin.ir.visitors.IrVisitor.visitFunction(IrVisitor.kt:38)
	at org.jetbrains.kotlin.ir.visitors.IrVisitor.visitSimpleFunction(IrVisitor.kt:65)
	at org.jetbrains.kotlin.ir.declarations.IrSimpleFunction.accept(IrSimpleFunction.kt:39)
	at org.jetbrains.kotlin.backend.common.LowerKt.runOnFilePostfix(Lower.kt:144)
	at org.jetbrains.kotlin.backend.common.LowerKt.runOnFilePostfix$default(Lower.kt:137)
	at org.jetbrains.kotlin.backend.common.lower.inline.LocalClassesInInlineLambdasLowering.lower(LocalClasses.kt:43)
	at org.jetbrains.kotlin.backend.common.FileLoweringPass.lower(Lower.kt:42)
	at org.jetbrains.kotlin.backend.common.phaser.ModuleLoweringPhase.phaseBody(PhaseFactories.kt:67)
	at org.jetbrains.kotlin.backend.common.phaser.ModuleLoweringPhase.phaseBody(PhaseFactories.kt:62)
	at org.jetbrains.kotlin.config.phaser.NamedCompilerPhase.invoke(CompilerPhase.kt:102)
	at org.jetbrains.kotlin.backend.wasm.WasmCompilerKt.lowerPreservingTags(wasmCompiler.kt:153)
	at org.jetbrains.kotlin.backend.wasm.WasmCompilerKt.compileToLoweredIr(wasmCompiler.kt:128)
	at org.jetbrains.kotlin.cli.pipeline.web.wasm.WholeWorldCompilerBase.lowerIr(KotlinIr2WasmIrCompiler.kt:60)
	at org.jetbrains.kotlin.cli.pipeline.web.wasm.WasmBackendPipelinePhase.compileNonIncrementally(WasmBackendPipelinePhase.kt:86)
	at org.jetbrains.kotlin.cli.pipeline.web.wasm.WasmBackendPipelinePhase.compileNonIncrementally(WasmBackendPipelinePhase.kt:31)
	at org.jetbrains.kotlin.cli.pipeline.web.WebBackendPipelinePhase.compileToBackendIrNonIncrementally(WebBackendPipelinePhase.kt:147)
	at org.jetbrains.kotlin.cli.pipeline.web.WebBackendPipelinePhase.executePhase(WebBackendPipelinePhase.kt:61)
	at org.jetbrains.kotlin.cli.pipeline.web.WebBackendPipelinePhase.executePhase(WebBackendPipelinePhase.kt:36)
	at org.jetbrains.kotlin.cli.pipeline.PipelinePhase.phaseBody(PipelinePhase.kt:63)
	at org.jetbrains.kotlin.cli.pipeline.PipelinePhase.phaseBody(PipelinePhase.kt:53)
	at org.jetbrains.kotlin.config.phaser.NamedCompilerPhase.invoke(CompilerPhase.kt:102)
	at org.jetbrains.kotlin.backend.common.phaser.CompositePhase.invoke(PhaseBuilders.kt:22)
	at org.jetbrains.kotlin.config.phaser.CompilerPhaseKt.invokeToplevel(CompilerPhase.kt:53)
	at org.jetbrains.kotlin.cli.pipeline.AbstractCliPipeline.runPhasedPipeline(AbstractCliPipeline.kt:113)
	at org.jetbrains.kotlin.cli.pipeline.AbstractCliPipeline.execute(AbstractCliPipeline.kt:70)
	at org.jetbrains.kotlin.cli.js.K2JSCompiler.doExecutePhased(K2JSCompiler.kt:41)
	at org.jetbrains.kotlin.cli.js.K2JSCompiler.doExecutePhased(K2JSCompiler.kt:28)
	at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.kt:94)
	at org.jetbrains.kotlin.cli.common.CLICompiler.exec(CLICompiler.kt:366)
	at org.jetbrains.kotlin.daemon.CompileServiceImpl.compile(CompileServiceImpl.kt:1898)
	at org.jetbrains.kotlin.daemon.CompileServiceImpl.compile(CompileServiceImpl.kt:905)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at java.rmi/sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:351)
	at java.rmi/sun.rmi.transport.Transport.serviceCall(Transport.java:166)
	at java.rmi/sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:543)
	at java.rmi/sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:744)
	at java.rmi/sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:623)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.IllegalStateException: Local delegated property LOCAL_DELEGATED_PROPERTY name:x type:kotlin.Any? flags:val has not delegate
	... 245 more
```
