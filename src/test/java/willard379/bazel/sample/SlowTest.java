package willard379.bazel.sample;

import org.junit.Test;

public class SlowTest {

	@Test
	public void _30秒かかるテスト() throws Exception {
		Thread.sleep(30 * 1_000);
	}
}
