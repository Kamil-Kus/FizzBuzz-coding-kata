package kamil.kus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {


    @ParameterizedTest
    @CsvFileSource(resources = "/fizz.csv", numLinesToSkip = 1)
    void fizzBuzz(String input, String expected) {
        final FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(input)).isEqualToIgnoringCase(expected);
    }
}