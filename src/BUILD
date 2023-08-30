load("@rules_java//java:defs.bzl", "java_binary")


java_library(
    name = "abstract_student",
    srcs = ["AbstractStudent.java"],
    visibility = [
        "//:__pkg__",
                ],
)

java_library(
    name = "student",
    srcs = ["Student.java"],
    deps = ["//src:certificate_student"],
    visibility = [
        "//:__pkg__",
                ],
)

java_library(
    name = "no_fin_student",
    srcs = ["NoFinAssist.java"],
    deps = ["//src:student"],
    visibility = [
        "//:__pkg__",
                ],
)

java_library(
    name = "abstract_reader",
    srcs = ["AbstractReader.java"],
    visibility = [
        "//:__pkg__",
                ],
)

java_library(
    name = "reader",
    srcs = ["Reader.java"],
    deps = ["//src:abstract_reader"],
    visibility = [
        "//:__pkg__",
                ],
)

java_library(
    name = "citizen",
    srcs = ["Citizen.java"],
    deps = ["//src:abstract_student"],
    visibility = [
        "//:__pkg__",
                ],
)

java_library(
    name = "certificate_student",
    srcs = ["CertificateStudent.java"],
    deps = ["//src:citizen"],
    visibility = [
        "//:__pkg__",
                ],
)

java_library(
    name = "abstract_student_factory",
    srcs = ["AbstractStudentFactory.java"],
    deps = [
        "//src:abstract_student",
        ],
)

java_library(
    name = "student_factory",
    srcs = ["StudentFactory.java"],
    deps = [
        "//src:abstract_student_factory",
        "//src:abstract_student",
        "//src:student",
        "//src:citizen",
        "//src:certificate_student",
        "//src:no_fin_student",
        "//src/distinguisher:decider",
        "//src/distinguisher:student_type",
        ],
    visibility = [
        "//:__pkg__",
                ],
)