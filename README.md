https://youtrack.jetbrains.com/issue/CMP-10847/WEB-Expression-uses-unlinked-type-parameter-symbol

### Fails at runtime when run Js or WasmJs targets, but run successfully on Jvm target

See [app.kt](module1/src/commonMain/kotlin/app.kt) for problem code

`./gradlew jsBrowserDevelopmentRun`

or

`./gradlew wasmJsBrowserDevelopmentRun`

Fail message (for Js and WasmJs targets):

```  
Reference to declaration 'result' can not be evaluated: Expression uses unlinked type parameter symbol '/Test1|Test1(kotlin.coroutines.SuspendFunction0<0:0>;androidx.compose.runtime.Composer?;kotlin.Int){0§<kotlin.Any>}[0]:1:2:3' declared in file app.kt
```
