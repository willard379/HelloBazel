package willard379.bazel.sample;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class HelloBazel {

	public static void main(String[] args) {
		String name = (ArrayUtils.isNotEmpty(args) && StringUtils.isNotEmpty(args[0])) ? args[0] : "Bazel";
		System.out.println(String.format("Hello, %s!", name));
	}
}
