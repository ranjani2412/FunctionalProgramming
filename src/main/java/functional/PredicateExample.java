package functional;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        System.out.println("IMPERATIVE");
        System.out.println("Valid Phone Number : "+isPhoneNumberValid("0790067888"));
        System.out.println("DECLARATIVE");
        System.out.println("Valid Phone Number : "+ isPhoneValidPredicate.test("0790067888"));
        System.out.println("Valid Phone Number or international : " +
                isPhoneValidPredicate.or(isNumberInternational).test("098907899"));
    }

    static boolean isPhoneNumberValid(String phnNumber) {
        return phnNumber.startsWith("07") && phnNumber.length() == 10;
    }

    static Predicate<String> isPhoneValidPredicate = phn ->
            phn.startsWith("07") && phn.length() == 10;

    static Predicate<String> isNumberInternational = phn ->
            !phn.startsWith("07");
}
