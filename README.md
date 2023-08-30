

To build the entrypoint toward testing, please install bazel perform the following build:

```bash
bazel run :test
```

To have different test cases, please change the variable in `Test.java` to the name of the file you want to include in the `data` directory. For example:
```java
String file_name = "data/hw2.txt";
```