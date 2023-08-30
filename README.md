

To build the entrypoint toward testing, please install [Bazel](https://bazel.build/install) to perform the following build:

```bash
bazel run :test
```

To have different test cases, please change the variable in `Test.java` to the name of the file you want to include in the `data` directory. For example:
```java
String file_name = "data/hw2.txt";
```

If you want to compare the difference in output for your files, after you compile the program, then go ahead and perform these commands in your command line:

```bash
./bazel-bin/test > tmp.out && diff tmp.out data/hw2_output.txt
```