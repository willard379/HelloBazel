package willard379.bazel.sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloBazelTest {

	private ConsoleTestFixture console = new ConsoleTestFixture();

	@Before
	public void setUp() {
		console.startMonitoring();
	}

	@After
	public void tearDown() {
		console.stopMonitoring();
	}

	@Test
	public void null空文字以外の文字列を渡すと_挨拶を返す() throws Exception {
		// set up fixture
		String[] args = { "willard379", };

		// exercise SUT
		HelloBazel.main(args);

		// verify outcome
		assertThat(console.getStdout(), is("Hello, willard379!"));
	}

	@Test
	public void null配列を渡すと_デフォルトの挨拶を返す() throws Exception {
		// set up fixture
		String[] args = null;

		// exercise SUT
		HelloBazel.main(args);

		// verify outcome
		assertThat(console.getStdout(), is("Hello, Bazel!"));
	}

	@Test
	public void 空配列を渡すと_デフォルトの挨拶を返す() throws Exception {
		// set up fixture
		String[] args = ArrayUtils.EMPTY_STRING_ARRAY;

		// exercise SUT
		HelloBazel.main(args);

		// verify outcome
		assertThat(console.getStdout(), is("Hello, Bazel!"));
	}

	@Test
	public void null文字列を渡すと_デフォルトの挨拶を返す() throws Exception {
		// set up fixture
		String[] args = { null, };

		// exercise SUT
		HelloBazel.main(args);

		// verify outcome
		assertThat(console.getStdout(), is("Hello, Bazel!"));
	}

	@Test
	public void 空文字列を渡すと_デフォルトの挨拶を返す() throws Exception {
		// set up fixture
		String[] args = { "", };

		// exercise SUT
		HelloBazel.main(args);

		// verify outcome
		assertThat(console.getStdout(), is("Hello, Bazel!"));
	}

	@Test
	public void 要素数2以上の配列を渡すと_最初の要素で挨拶を返す() throws Exception {
		// set up fixture
		String[] args = { "willard379", "Seiji", };

		// exercise SUT
		HelloBazel.main(args);

		// verify outcome
		assertThat(console.getStdout(), is("Hello, willard379!"));
	}

}
