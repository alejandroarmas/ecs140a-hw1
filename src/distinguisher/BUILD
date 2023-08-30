load("@rules_java//java:defs.bzl", "java_binary")


java_library(
    name = "abstract_decider",
    srcs = ["AbstractDecider.java"],
    deps = [
        "//src/distinguisher:student_type",
        ],
    visibility = [
        "//:__pkg__",
        "//src:__pkg__",
                ],
)

java_library(
    name = "decider",
    srcs = ["Decider.java"],
    deps = [
        "//src/distinguisher:abstract_decider",
        "//src/field:abstract_field_check",
        "//src/field:name_check",
        "//src/field:char_check",
        "//src/field:int_check",
        "//src/field:float_check",
        "//src/distinguisher:student_type",
        ],
    visibility = [
        "//:__pkg__",
        "//src:__pkg__",
                ],
)

java_library(
    name = "student_type",
    srcs = ["StudentType.java"],
    visibility = [
        "//:__pkg__",
        "//src:__pkg__",
                ],
)