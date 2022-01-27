package kamil.kus;

public class FizzBuzz {

    public static String fizzBuzz(String number) {
        final int integer = Integer.parseInt(number);
        if (checkStringContainsThreeAndFive(number) && isBuzz(integer) && isFizz(integer)) return "FizzBuzz";
        if (checkStringContainsThree(number) && isFizz(integer)) return "Fizz";
        if (checkStringContainsFive(number) && isBuzz(integer)) return "Buzz";
        return Integer.toString(integer);
    }

    private static boolean isBuzz(int integer) {
        return integer % 5 == 0;
    }

    private static boolean isFizz(int integer) {
        return integer % 3 == 0;
    }

    private static boolean checkStringContainsThreeAndFive(String number) {
        return number.contains("3") && number.contains("5");
    }

    private static boolean checkStringContainsThree(String number) {
        return number.contains("3");
    }

    private static boolean checkStringContainsFive(String number) {
        return number.contains("5");
    }
}
