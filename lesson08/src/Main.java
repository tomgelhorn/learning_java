import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Bmazon!");

        Apple apple = new Apple("Green");
        Cherry cherry = new Cherry("Red");
        Cherry cherry1 = new Cherry("Yellow");

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(cherry1);
        fruits.add(apple);
        fruits.add(cherry);


        Pen stabilo = new Pen("Stabilo", "Ballpoint");

        Box<Apple> order1 = new Box<>("Order 1", apple);
        Box<Cherry> order2 = new Box<>("Order 2", cherry);
        Box<Cherry> order3 = new Box<>("Order 3", cherry1);

        System.out.println(order1);
        System.out.println(order2);


        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println(fruits);

        System.out.println(order2.compareContent(order3));

        System.out.println("\nPAIR TESTING...\n");

        Pair<Integer> integerPair = new Pair<>(10, 11);

        System.out.println("Expected: 11, Actual: " + integerPair.max());
        System.out.println("Expected: 10, Actual: " + integerPair.min());
        System.out.println("Expected: -1, Actual: " + integerPair.compareValues());

        integerPair.swap();

        System.out.println("Expected: 1, Actual: " + integerPair.compareValues());

        Pair<String> stringPair = new Pair<>("MyFirstString", "MySecondString");

        System.out.println("Expected: MySecondString, Actual: " + stringPair.max());
        System.out.println("Expected: MyFirstString, Actual: " + stringPair.min());
        System.out.println("Expected: -13, Actual: " + stringPair.compareValues());

        stringPair.swap();

        System.out.println("Expected: 13, Actual: " + stringPair.compareValues());

        Pair<Double> doublePair = new Pair<>(120.34, -1039.23);

        System.out.println("Expected: 120.34, Actual: " + doublePair.max());
        System.out.println("Expected: -1039.23, Actual: " + doublePair.min());
        System.out.println("Expected: 1, Actual: " + doublePair.compareValues());

        doublePair.swap();

        System.out.println("Expected: -1, Actual: " + doublePair.compareValues());

        Pair<Boolean> booleanPair = new Pair<>(true, false);

        System.out.println("Expected: true, Actual: " + booleanPair.max());
        System.out.println("Expected: false, Actual: " + booleanPair.min());
        System.out.println("Expected: 1, Actual: " + booleanPair.compareValues());

        booleanPair.swap();

        System.out.println("Expected: -1, Actual: " + booleanPair.compareValues());
    }
}