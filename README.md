https://youtrack.jetbrains.com/issue/KT-84134

### Fails at runtime for Js target, but running successfully on WasmJs target

`./gradlew jsBrowserDevelopmentRun` - Fails at runtime

`./gradlew wasmJsBrowserDevelopmentRun` - OK 


Notes: it happens for Kotlin version 2.3.20-Beta2. With versions 2.3.0, 2.3.10-RC2 it is OK. 


Error message at runtime:

```  
Function 'get' can not be called: No function found for symbol 'kotlin.js/get|get@kotlin.Any(){0§<kotlin.Any>}[0]'
captureStack@webpack-internal:///./kotlin/example-module2.mjs:14410:23
IrLinkageError@webpack-internal:///./kotlin/example-module2.mjs:8376:15
throwIrLinkageError@webpack-internal:///./kotlin/example-module2.mjs:8372:9
@webpack-internal:///./kotlin/example-module2.mjs:213376:24
@webpack-internal:///./kotlin/example-module2.mjs:213301:22
equals@webpack-internal:///./kotlin/example-module2.mjs:14221:17
findKey@webpack-internal:///./kotlin/example-module2.mjs:18084:15
@webpack-internal:///./kotlin/example-module2.mjs:18435:22
@webpack-internal:///./kotlin/example-module2.mjs:17503:29
makeSkTextStyle@webpack-internal:///./kotlin/example-module2.mjs:211686:52
@webpack-internal:///./kotlin/example-module2.mjs:211897:32
@webpack-internal:///./kotlin/example-module2.mjs:212357:32
SkiaParagraphIntrinsics@webpack-internal:///./kotlin/example-module2.mjs:212922:45
ActualParagraphIntrinsics@webpack-internal:///./kotlin/example-module2.mjs:212879:10
ParagraphIntrinsics_0@webpack-internal:///./kotlin/example-module2.mjs:195654:10
setLayoutDirection_0@webpack-internal:///./kotlin/example-module2.mjs:389837:11
@webpack-internal:///./kotlin/example-module2.mjs:390097:54
@webpack-internal:///./kotlin/example-module2.mjs:390034:21
@webpack-internal:///./kotlin/example-module2.mjs:392178:37
@webpack-internal:///./kotlin/example-module2.mjs:253136:39
MeasurePassDelegate$performMeasureBlock$lambda/<@webpack-internal:///./kotlin/example-module2.mjs:261266:45
@webpack-internal:///./kotlin/example-module2.mjs:142451:13
@webpack-internal:///./kotlin/example-module2.mjs:261671:42
@webpack-internal:///./kotlin/example-module2.mjs:261634:8
OverlayLayout$lambda@webpack-internal:///./kotlin/example-module2.mjs:279672:26
@webpack-internal:///./kotlin/example-module2.mjs:279637:15
@webpack-internal:///./kotlin/example-module2.mjs:252283:81
MeasurePassDelegate$performMeasureBlock$lambda/<@webpack-internal:///./kotlin/example-module2.mjs:261266:45
@webpack-internal:///./kotlin/example-module2.mjs:142451:13
@webpack-internal:///./kotlin/example-module2.mjs:261671:42
@webpack-internal:///./kotlin/example-module2.mjs:261634:8
@webpack-internal:///./kotlin/example-module2.mjs:246896:52
@webpack-internal:///./kotlin/example-module2.mjs:252283:81
@webpack-internal:///./kotlin/example-module2.mjs:279885:30
@webpack-internal:///./kotlin/example-module2.mjs:253136:39
MeasurePassDelegate$performMeasureBlock$lambda/<@webpack-internal:///./kotlin/example-module2.mjs:261266:45
@webpack-internal:///./kotlin/example-module2.mjs:142481:17
@webpack-internal:///./kotlin/example-module2.mjs:261671:42
@webpack-internal:///./kotlin/example-module2.mjs:255457:52
doRemeasure@webpack-internal:///./kotlin/example-module2.mjs:259828:22
remeasureAndRelayoutIfNeeded@webpack-internal:///./kotlin/example-module2.mjs:259973:23
@webpack-internal:///./kotlin/example-module2.mjs:260577:57
@webpack-internal:///./kotlin/example-module2.mjs:281114:67
@webpack-internal:///./kotlin/example-module2.mjs:281737:30
@webpack-internal:///./kotlin/example-module2.mjs:287221:14
@webpack-internal:///./kotlin/example-module2.mjs:285921:8
@webpack-internal:///./kotlin/example-module2.mjs:285727:14
@webpack-internal:///./kotlin/example-module2.mjs:295608:26
@webpack-internal:///./kotlin/example-module2.mjs:175636:25
CanvasRenderer$needRedraw$lambda/<@webpack-internal:///./kotlin/example-module2.mjs:175509:12
FrameRequestCallback*@webpack-internal:///./kotlin/example-module2.mjs:175561:7
@webpack-internal:///./kotlin/example-module2.mjs:175687:24
@webpack-internal:///./kotlin/example-module2.mjs:175694:10
@webpack-internal:///./kotlin/example-module2.mjs:175702:15
l@webpack-internal:///./kotlin/example-module2.mjs:295612:8
@webpack-internal:///./kotlin/example-module2.mjs:285609:10
l@webpack-internal:///./kotlin/example-module2.mjs:285388:8
@webpack-internal:///./kotlin/example-module2.mjs:282041:8
onRootConstrainsChanged@webpack-internal:///./kotlin/example-module2.mjs:280670:41
@webpack-internal:///./kotlin/example-module2.mjs:281633:26
@webpack-internal:///./kotlin/example-module2.mjs:287015:20
resize_0@webpack-internal:///./kotlin/example-module2.mjs:295264:17
@webpack-internal:///./kotlin/example-module2.mjs:295105:17
@webpack-internal:///./kotlin/example-module2.mjs:295085:14
l@webpack-internal:///./kotlin/example-module2.mjs:295127:14
@webpack-internal:///./kotlin/example-module2.mjs:295454:15
@webpack-internal:///./kotlin/example-module2.mjs:91566:49
emitAllImpl@webpack-internal:///./kotlin/example-module2.mjs:91414:14
@webpack-internal:///./kotlin/example-module2.mjs:91453:29
@webpack-internal:///./kotlin/example-module2.mjs:91521:14
@webpack-internal:///./kotlin/example-module2.mjs:295798:33
@webpack-internal:///./kotlin/example-module2.mjs:295782:14
l@webpack-internal:///./kotlin/example-module2.mjs:295831:14
@webpack-internal:///./kotlin/example-module2.mjs:19350:36
@webpack-internal:///./kotlin/example-module2.mjs:18926:32
@webpack-internal:///./kotlin/example-module2.mjs:18962:15
@webpack-internal:///./kotlin/example-module2.mjs:97105:22
FlushCoroutineDispatcher$dispatch$slambda$lambda/<@webpack-internal:///./kotlin/example-module2.mjs:282666:14
performRun@webpack-internal:///./kotlin/example-module2.mjs:282725:5
@webpack-internal:///./kotlin/example-module2.mjs:282752:19
@webpack-internal:///./kotlin/example-module2.mjs:282740:14
l@webpack-internal:///./kotlin/example-module2.mjs:282774:14
@webpack-internal:///./kotlin/example-module2.mjs:19350:36
@webpack-internal:///./kotlin/example-module2.mjs:18926:32
@webpack-internal:///./kotlin/example-module2.mjs:18962:15
@webpack-internal:///./kotlin/example-module2.mjs:97105:22
@webpack-internal:///./kotlin/example-module2.mjs:100542:17
WindowMessageQueue$schedule$lambda/<@webpack-internal:///./kotlin/example-module2.mjs:100255:12
promise callback*@webpack-internal:///./kotlin/example-module2.mjs:100267:7
@webpack-internal:///./kotlin/example-module2.mjs:100522:10
@webpack-internal:///./kotlin/example-module2.mjs:100587:23
@webpack-internal:///./kotlin/example-module2.mjs:100698:26
resumeCancellableWith@webpack-internal:///./kotlin/example-module2.mjs:96626:34
startCoroutineCancellable@webpack-internal:///./kotlin/example-module2.mjs:98071:26
@webpack-internal:///./kotlin/example-module2.mjs:83592:32
@webpack-internal:///./kotlin/example-module2.mjs:81992:9
launch@webpack-internal:///./kotlin/example-module2.mjs:82137:13
ComposeWebSemanticsListener@webpack-internal:///./kotlin/example-module2.mjs:294454:9
ComposeWindow$platformContext$1@webpack-internal:///./kotlin/example-module2.mjs:295511:13
ComposeWindow@webpack-internal:///./kotlin/example-module2.mjs:295989:29
ComposeViewport$lambda_2/<@webpack-internal:///./kotlin/example-module2.mjs:294867:5
onSkikoReady$lambda/<@webpack-internal:///./kotlin/example-module2.mjs:296259:5
onWasmReady$lambda/<@webpack-internal:///./kotlin/example-module2.mjs:174220:5
promise callback*onWasmReady@webpack-internal:///./kotlin/example-module2.mjs:174135:7
onSkikoReady@webpack-internal:///./kotlin/example-module2.mjs:294888:14
ComposeViewport_0@webpack-internal:///./kotlin/example-module2.mjs:294776:10
ComposeViewport$lambda_0/<@webpack-internal:///./kotlin/example-module2.mjs:294808:22
onDomReady@webpack-internal:///./kotlin/example-module2.mjs:294884:5
ComposeViewport@webpack-internal:///./kotlin/example-module2.mjs:294704:13
main$lambda@webpack-internal:///./kotlin/example-module2.mjs:474266:18
onWasmReady$lambda/<@webpack-internal:///./kotlin/example-module2.mjs:174220:5
promise callback*onWasmReady@webpack-internal:///./kotlin/example-module2.mjs:174135:7
onReady@webpack-internal:///./kotlin/example-module2.mjs:474219:14
main@webpack-internal:///./kotlin/example-module2.mjs:474222:10
mainWrapper@webpack-internal:///./kotlin/example-module2.mjs:474270:3
@webpack-internal:///./kotlin/example-module2.mjs:476607:1
./kotlin/example-module2.mjs@http://localhost:8080/composeApp.js:189:1
__webpack_require__@http://localhost:8080/composeApp.js:249:32
@http://localhost:8080/composeApp.js:1337:56
@http://localhost:8080/composeApp.js:1340:12
webpackUniversalModuleDefinition@http://localhost:8080/composeApp.js:17:21
@http://localhost:8080/composeApp.js:18:3
ERROR
Function 'get' can not be called: No function found for symbol 'kotlin.js/get|get@kotlin.Any(){0§<kotlin.Any>}[0]'
captureStack@webpack-internal:///./kotlin/example-module2.mjs:14410:23
IrLinkageError@webpack-internal:///./kotlin/example-module2.mjs:8376:15
throwIrLinkageError@webpack-internal:///./kotlin/example-module2.mjs:8372:9
WeakKeysCache$registry$lambda/<@webpack-internal:///./kotlin/example-module2.mjs:213321:24

```