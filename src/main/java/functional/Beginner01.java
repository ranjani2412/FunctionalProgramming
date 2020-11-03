package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Beginner01 {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Alice", Gender.FEMALE),
                new Person("Tom", Gender.MALE),
                new Person("Alexa", Gender.FEMALE),
                new Person("Reese", Gender.FEMALE),
                new Person("Ryan", Gender.MALE)
        );
        System.out.println("IMPERATIVE APPROACH");
        List<Person> females = new ArrayList<>();
        for (Person person : persons) {
            if (person.gender == Gender.FEMALE) {
                females.add(person);
            }
        }
        for(Person p:females) {
            System.out.println("Females : " + p);
        }

        System.out.println("DECLARATIVE APPROACH");
        persons.stream().filter(person ->
                person.gender == Gender.FEMALE
        ).collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
