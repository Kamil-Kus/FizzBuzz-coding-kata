package kamil.kus;

public class FizzBuzz {

    public String fizzBuzz(String number) {
        final int integer = Integer.parseInt(number);
        if (isBuzz(integer) && isFizz(integer)) return "FizzBuzz";
        if (isFizz(integer)) return "Fizz";
        if (isBuzz(integer)) return "Buzz";
        return Integer.toString(integer);
    }

    private boolean isBuzz(int integer) {
        return integer % 5 == 0;
    }

    private boolean isFizz(int integer) {
        return integer % 3 == 0;
    }

}
