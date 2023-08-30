load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "entrypoint",
    srcs = ["Entrypoint.java"],
    main_class = "Entrypoint",
    data = glob(["data/*.txt"]),
    deps = [
        "//src:student",
        "//src:abstract_student",
        "//src:reader",
        "//src:student_factory"
        ]
)

java_binary(
    name = "test",
    srcs = ["Test.java"],
    main_class = "Test",
    data = glob(["data/*.txt"]),
    deps = [
        "//src:student",
        "//src:citizen",
        "//src:certificate_student",
        "//src:abstract_student",
        "//src:no_fin_student",
        "//src:reader",
        "//src:student_factory"
        ]
)