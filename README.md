# incremental compiler issue

Steps to reproduce:

1. Goto `module1/kotlin/test/module1/main.kt` and run main function
2. Goto `module1/kotlin/test/module1/Global.kt` and rename test.module1.GlobalContext to, for example, test.module1.GlobalContext1
3. Goto `module1/kotlin/test/module1/main.kt` and run main function again
4. There will be runtime error: `java.lang.ClassNotFoundException: test.module1.GlobalContext`

If in gradle.properties uncomment first line (`kotlin.incremental=false`) then run main will be executed normally 
