package decode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class DecoderTest {

	private Decoder decoder;

	@Before
	public void setUp() {
		this.decoder = new Decoder();
	}

	@Test
	public void thatDecoderCanDecodeMultipleWordsSeparatedBy3Spaces() {
		final String decodedMessage = this.decoder.decode("-- --  -- --   -- --    -- --     -- --       -- --        -- --");

		assertThat(decodedMessage.split(" ").length, is(7));
		assertThat(decodedMessage, is("MM MM MM MM MM MM MM"));
	}

	@Test
	public void thatAllLettersTranslateAsExpected() {
		final String decodedMessage = this.decoder.decode("- .... .  --.- ..- .. -.-. -.-  -... .-. --- .-- -.  ..-. --- -..- " +
				" .--- ..- -- .--. ...  --- ...- . .-.  - .... .  .-.. .- --.. -.--  -.. --- --.");

		assertThat(decodedMessage, is("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
	}

	@Test
	public void thatDecoderDecodesASingleCharacter() {
		final String decodedMessage = this.decoder.decode("--");

		assertThat(decodedMessage, is("M"));
	}
}