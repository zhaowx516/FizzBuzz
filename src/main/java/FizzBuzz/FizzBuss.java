package FizzBuzz;


import java.util.stream.IntStream;

public class FizzBuss {

    public static void main(String[] args) {
        IntStream.range(1, 100).forEach(k -> System.out.println(count(k)));
    }

    public static String count(int value) {
        if (isRealtion5(value) && isRelation3(value)) return "FizzBuzz";
        if (isRelation3(value)) return "Fizz";
        if (isRealtion5(value)) return "Buzz";
        return String.valueOf(value);

    }

    private static boolean isRelation3(int value) {
        return value % 3 == 0 || String.valueOf(value).contains("3");
    }

    private static boolean isRealtion5(int value) {
        return value % 5 == 0 || String.valueOf(value).contains("5");
    }
}
