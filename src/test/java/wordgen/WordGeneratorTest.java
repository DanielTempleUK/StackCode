package wordgen;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class WordGeneratorTest {

	@Test
	public void thatWordGeneratorGeneratorsAllWords() {
		final WordGenerator wordGen = new WordGenerator();

		final List<String> words = wordGen.generateWords();

		assertThat(words.size(), is(10000));
	}

	@Test
	public void thatWordGeneratorGeneratorsAllWords2() {
		final WordGenerator wordGen = new WordGenerator();

		final List<String> words = wordGen.words((char)48, (char)57, 4);

		assertThat(words.size(), is(10000));
	}

}
