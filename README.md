### Fails at runtime when run Js or WasmJs targets, but run successfully on Jvm target

./gradlew jsBrowserDevelopmentRun

Fail message (for Js and WasmJs targets):

```  
IrLinkageError: Abstract function 'compose' is not implemented in non-abstract class 'TestValueImpl'
```


P.S. when lib.kt move from module2 to module1 (all files are in the same module), than Js and WasmJs also work OK.  