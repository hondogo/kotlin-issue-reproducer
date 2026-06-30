https://youtrack.jetbrains.com/issue/CMP-10407/CMP-ClassNotFound-for-JVM-unknown-symbol-on-WEB-when-interface-with-default-arg-is-used

### Fails at runtime when run Jvm, Js or WasmJs targets

`./gradlew module1:jvmRun -DmainClass=MainKt --quiet`

or

`./gradlew jsBrowserDevelopmentRun`

or

`./gradlew wasmJsBrowserDevelopmentRun`

Fail message for JVM target:

```  
java.lang.NoClassDefFoundError: androidx/compose/runtime/internal/ComposableFunction0
	at AppKt.Test(app.kt:13)
	at AppKt.App(app.kt:6)
	at ComposableSingletons$MainKt.lambda_2012341649$lambda$0(main.kt:9)
```

Fail message for Web targets:

```  
Error was captured in composition. NATIVE_IMPLEMENTATIONS.kt:1:1
IrLinkageError: Function 'test$default' can not be called: No function found for symbol '/TestArg.ComposeDefaultImpls.test$default|test$default#static(androidx.compose.runtime.internal.ComposableFunction0<kotlin.Unit>?;TestArg;androidx.compose.runtime.Composer?;kotlin.Int;kotlin.Int){}[0]'
throwIrLinkageError@webpack-internal:///./kotlin/composeApp.js:6712:11
Test@webpack-internal:///./kotlin/composeApp.js:347285:26
App@webpack-internal:///./kotlin/composeApp.js:347258:11
ComposableSingletons$MainKt$lambda$_192488722$lambda_fnpj9d@webpack-internal:///./kotlin/composeApp.js:347359:10
@webpack-internal:///./kotlin/composeApp.js:243680:92
ComposableLambda$invoke$ref_22/<@webpack-internal:///./kotlin/composeApp.js:347348:10
ComposeWindow$lambda$lambda$lambda/<@webpack-internal:///./kotlin/composeApp.js:186221:15
@webpack-internal:///./kotlin/composeApp.js:243680:92
ComposableLambda$invoke$ref_14/<@webpack-internal:///./kotlin/composeApp.js:186231:10
OverlayLayout@webpack-internal:///./kotlin/composeApp.js:170549:14
TrackInteropPlacementContainer@webpack-internal:///./kotlin/composeApp.js:179310:20
ComposeWindow$lambda$lambda/<@webpack-internal:///./kotlin/composeApp.js:186376:39
@webpack-internal:///./kotlin/composeApp.js:243680:92
ComposableLambda$invoke$ref_15/<@webpack-internal:///./kotlin/composeApp.js:186427:10
CompositionLocalProvider@webpack-internal:///./kotlin/composeApp.js:197440:12
ComposeWindow$lambda_0/<@webpack-internal:///./kotlin/composeApp.js:186454:33
@webpack-internal:///./kotlin/composeApp.js:243680:92
ComposableLambda$invoke$ref_13/<@webpack-internal:///./kotlin/composeApp.js:186212:10
CompositionLocalProvider@webpack-internal:///./kotlin/composeApp.js:197440:12
ProvidePlatformCompositionLocals@webpack-internal:///./kotlin/composeApp.js:174533:31
BaseComposeScene$setContent$lambda_0/<@webpack-internal:///./kotlin/composeApp.js:176368:41
@webpack-internal:///./kotlin/composeApp.js:243680:92
ComposableLambda$invoke$ref_9/<@webpack-internal:///./kotlin/composeApp.js:176359:10
CompositionLocalProvider@webpack-internal:///./kotlin/composeApp.js:197440:12
ProvideCommonCompositionLocals@webpack-internal:///./kotlin/composeApp.js:159376:31
setContent$lambda$lambda/<@webpack-internal:///./kotlin/composeApp.js:176151:39
@webpack-internal:///./kotlin/composeApp.js:243680:92
ComposableLambda$invoke$ref_7/<@webpack-internal:///./kotlin/composeApp.js:176162:10
provide_0@webpack-internal:///./kotlin/composeApp.js:176111:16
setContent$lambda_0/<@webpack-internal:///./kotlin/composeApp.js:176189:18
@webpack-internal:///./kotlin/composeApp.js:243680:92
ComposableLambda$invoke$ref_6/<@webpack-internal:///./kotlin/composeApp.js:176129:10
invokeComposable@webpack-internal:///./kotlin/composeApp.js:255412:11
doCompose@webpack-internal:///./kotlin/composeApp.js:200145:31
@webpack-internal:///./kotlin/composeApp.js:202036:16
@webpack-internal:///./kotlin/composeApp.js:196116:27
@webpack-internal:///./kotlin/composeApp.js:212594:27
composeInitial@webpack-internal:///./kotlin/composeApp.js:194805:20
@webpack-internal:///./kotlin/composeApp.js:196038:21
setContent@webpack-internal:///./kotlin/composeApp.js:176093:17
@webpack-internal:///./kotlin/composeApp.js:178134:12
@webpack-internal:///./kotlin/composeApp.js:176545:38
setContent$default@webpack-internal:///./kotlin/composeApp.js:4641:12
ComposeWindow@webpack-internal:///./kotlin/composeApp.js:186516:18
ComposeViewport$lambda_0/<@webpack-internal:///./kotlin/composeApp.js:185127:7
onSkikoReady$lambda/<@webpack-internal:///./kotlin/composeApp.js:186790:7
onWasmReady$lambda/<@webpack-internal:///./kotlin/composeApp.js:321315:7
promise callback*onWasmReady@webpack-internal:///./kotlin/composeApp.js:321225:9
onSkikoReady@webpack-internal:///./kotlin/composeApp.js:186700:16
ComposeViewport@webpack-internal:///./kotlin/composeApp.js:185012:12
main$lambda@webpack-internal:///./kotlin/composeApp.js:347383:20
onWasmReady$lambda/<@webpack-internal:///./kotlin/composeApp.js:321315:7
promise callback*onWasmReady@webpack-internal:///./kotlin/composeApp.js:321225:9
main@webpack-internal:///./kotlin/composeApp.js:347344:16
mainWrapper@webpack-internal:///./kotlin/composeApp.js:347387:5
@webpack-internal:///./kotlin/composeApp.js:349303:3
@webpack-internal:///./kotlin/composeApp.js:129:35
@webpack-internal:///./kotlin/composeApp.js:133:2
./kotlin/composeApp.js@http://localhost:8080/composeApp.js:177:1
__webpack_require__@http://localhost:8080/composeApp.js:243:32
@http://localhost:8080/composeApp.js:1331:56
@http://localhost:8080/composeApp.js:1334:12
webpackUniversalModuleDefinition@http://localhost:8080/composeApp.js:17:21
@http://localhost:8080/composeApp.js:18:3
```
