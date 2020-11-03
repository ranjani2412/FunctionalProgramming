package functional;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println(getRandomUrl());
        System.out.println(getRandomUrlSupplier.get());
    }

    static String getRandomUrl() {
        return "localhost:8080/users";
    }

    static Supplier<String> getRandomUrlSupplier = () ->
            "localhost:8080/users";
}
