### Fails when run production build 

./gradlew jsBrowserProductionRun

Fail message:
```  
Uncaught TypeError: Companion_instance_0 is undefined
Test2 example-module1.js:313
init$init$ Standard.kt:3
<anonymous> example-module1.js:318
<anonymous> example-module1.js:18
<anonymous> example-module1.js:19
```

### Success when run development build

./gradlew jsBrowserDevelopmentRun