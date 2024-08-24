https://youtrack.jetbrains.com/issue/KT-70778/Kotlin-Js-companion-is-undefined-in-production-build

### Fails when run production build 

./gradlew jsBrowserProductionRun

Fail message:
```  
Uncaught TypeError: Companion_instance is undefined
    Test example-module1.js:303
    init$init$ Standard.kt:6
    <anonymous> example-module1.js:308
    <anonymous> example-module1.js:18
    <anonymous> example-module1.js:19
```

### Success when run development build

./gradlew jsBrowserDevelopmentRun