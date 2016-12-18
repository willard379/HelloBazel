package willard379.bazel.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.lang3.StringUtils;

public class ConsoleTestFixture {

	private final PrintStream originalOut;

	private ByteArrayOutputStream mockStdout;

	public ConsoleTestFixture() {
		originalOut = System.out;
	}

	public void startMonitoring() {
		mockStdout = new ByteArrayOutputStream();
		System.setOut(new PrintStream(mockStdout));
	}

	public void stopMonitoring() {
		System.setOut(originalOut);
		mockStdout = null;
	}

	public String getStdout() {
		return StringUtils.chomp(new String(mockStdout.toByteArray(), StandardCharsets.UTF_8));
	}
}
