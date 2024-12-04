### Error when run  

./gradlew check

Error:
```  
java.lang.IllegalAccessError: failed to access class pack.TestException from class test.Test1 (pack.TestException and test.Test1 are in unnamed module of loader 'app')
	at test.Test1.test(Test1.kt:12)
```
