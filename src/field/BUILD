load("@rules_java//java:defs.bzl", "java_binary")


java_library(
    name = "abstract_field_check",
    srcs = ["AbstractFieldCheck.java"],
    visibility = [
        "//:__pkg__",
        "//src/distinguisher:__pkg__",
        "//src:__pkg__",
                ],
)

java_library(
    name = "name_check",
    srcs = ["NameCheck.java"],
    deps = ["//src/field:abstract_field_check"],
    visibility = [
        "//:__pkg__",
        "//src/distinguisher:__pkg__",
        "//src:__pkg__",
                ],
)

java_library(
    name = "char_check",
    srcs = ["CharCheck.java"],
    deps = ["//src/field:abstract_field_check"],
    visibility = [
        "//:__pkg__",
        "//src/distinguisher:__pkg__",
        "//src:__pkg__",
                ],
)

java_library(
    name = "int_check",
    srcs = ["IntCheck.java"],
    deps = ["//src/field:abstract_field_check"],
    visibility = [
        "//:__pkg__",
        "//src/distinguisher:__pkg__",
        "//src:__pkg__",
                ],
)

java_library(
    name = "float_check",
    srcs = ["FloatCheck.java"],
    deps = ["//src/field:abstract_field_check"],
    visibility = [
        "//:__pkg__",
        "//src/distinguisher:__pkg__",
        "//src:__pkg__",
                ],
)
