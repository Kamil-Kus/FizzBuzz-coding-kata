package kamil.kus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {


    @ParameterizedTest
    @CsvFileSource(resources = "/fizz2.csv", numLinesToSkip = 1)
    void fizzBuzz(String input, String expected) {
        assertThat(FizzBuzz.fizzBuzz(input)).isEqualToIgnoringCase(expected);
    }
}