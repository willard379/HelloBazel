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
	name = "AllTests",
	size = "small",
	deps = [
		":HelloBazelApi",
		"@commons_lang3//jar",
		"@junit//jar",
		"@hamcrest_all//jar",
		":takari_cpsuite",
	],
	srcs = glob(["src/test/java/**/*.java",]),
)

java_import(
	name = "takari_cpsuite",
	jars = [
		"lib/takari-cpsuite-1.2.7.jar",
	],
)