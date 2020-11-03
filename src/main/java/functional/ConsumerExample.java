package functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Customer customer = new Customer ("Ranjani Harish", "78907899");
        greetCustomer(customer);
        greetCustomerConsumer.accept(customer);
        consumerV2.accept(customer, false);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello "+customer.name+", thank you for registering your phone "+customer.phoneNumber+" with us");
    }

    static BiConsumer<Customer, Boolean> consumerV2 = (customer, isTrue) ->
            System.out.println("Hello "+customer.name+
                    ", thank you for registering your phone "+
                    (isTrue ? customer.phoneNumber : "***") +" with us");

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "+customer.name+", thank you for registering your phone "+customer.phoneNumber+" with us");

    static class Customer {
        String name;
        String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
