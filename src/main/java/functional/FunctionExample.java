package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        System.out.println("IMPERATIVE");
        int incremented = incrementByOne(1);
        System.out.println("Incremented Value "+incremented);

        System.out.println("DECLARATIVE");
        int incremented2 = incrementByOneFunction.apply(1);
        System.out.println("Incremented Value "+incremented2);
        System.out.println("MultiplyBy10 Value "+multiplyBy10.apply(incremented2));

        Function<Integer, Integer> chainingOperations = incrementByOneFunction.andThen(multiplyBy10);
        System.out.println("Chaining opeartions ====== "+chainingOperations.apply(4));

        BiFunction<Integer, Integer, Integer> addAndMultiplyByFunction =
                (number1, number2) -> (number1 + 1)*number2;
        System.out.println(addAndMultiplyByFunction.apply(6,10));
    }

    static Function<Integer, Integer> incrementByOneFunction =
                    number -> number+1;

    static Function<Integer, Integer> multiplyBy10 = multiply -> multiply * 10;
    static int incrementByOne(int number) {
        return number + 1;
    }
}
