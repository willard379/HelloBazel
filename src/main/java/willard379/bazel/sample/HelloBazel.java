package willard379.bazel.sample;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class HelloBazel {

	public static void main(String[] args) {
		String name = (ArrayUtils.isEmpty(args) || StringUtils.isEmpty(args[0])) ? "Bazel" : args[0];
		System.out.println(String.format("Hello, %s!", name));
	}
}
