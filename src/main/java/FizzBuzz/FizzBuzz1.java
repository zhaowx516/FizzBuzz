package FizzBuzz;

import java.util.stream.IntStream;

public class FizzBuzz1 {

    public static void main(String[] args) {
        IntStream.range(1, 101).forEach(k -> System.out.println(of(k)));
    }

    public static String of(int value) {
        if (isRelation3(value) && isRelation5(value)) return "FizzBuzz";
        if (isRelation3(value)) return "Fizz";
        if (isRelation5(value)) return "Buzz";
        return "" + value;
    }

    private static boolean isRelation5(int value) {
        return value % 5 == 0 || String.valueOf(value).contains("5");
    }

    private static boolean isRelation3(int value) {
        return value % 3 == 0 || String.valueOf(value).contains("3");
    }
}
