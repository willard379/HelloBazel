java_binary(
	name = "HelloBazel",
	srcs = glob(["src/main/java/**/*.java",]),
	main_class = "willard379.bazel.sample.HelloBazel",
	deps = ["@commons_lang3//jar",],
)

java_library(
	name = "HelloBazelApi",
	srcs = glob(["src/main/java/**/*.java",]),
	deps = ["@commons_lang3//jar",],
)

java_test(
	name = "HelloBazelTest",
	deps = [
		":HelloBazelApi",
		"@commons_lang3//jar",
		"@junit//jar",
		"@hamcrest_all//jar",
	],
	srcs = glob(["src/test/java/**/*.java",]),
	test_class = "willard379.bazel.sample.HelloBazelTest",
)