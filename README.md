# Kotlin Compiler Bug

When you run this project in a device with Android 10 and earlier you encounter this exception:
```
java.lang.IllegalAccessError: Method 'java.lang.Object java.lang.Object.clone()' implementing interface method 'java.lang.Object com.example.kotlincompilerbug.Cloneable.clone()' is not public (declaration of 'com.example.kotlincompilerbug.TestCloneable' appears in /data/app/com.example.kotlincompilerbug--KxQhBSYeT1Xw6CfTIBvcA==/base.apk!classes4.dex)
```
