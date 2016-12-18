package willard379.bazel.sample;

public class HelloBazel {

	public static void main(String[] args) {
		String name = (args.length == 0 || args[0].isEmpty()) ? "Bazel" : args[0];
		System.out.println(String.format("Hello, %s!", name));
	}
}
