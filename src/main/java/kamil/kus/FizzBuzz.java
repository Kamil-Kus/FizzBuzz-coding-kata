package kamil.kus;

public class FizzBuzz {

    public String fizzBuzz(String number) {
        final int integer = Integer.parseInt(number);
        if (integer % 3 == 0 && integer % 5 == 0) return "FizzBuzz";
        if (integer % 3 == 0) return "Fizz";
        if (integer % 5 == 0) return "Buzz";
        return Integer.toString(integer);
    }

}
