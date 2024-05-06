public class Main {
    public static void main(String[] args) {
        Owner jack = new Owner("Jack");
        Dog sammy = new Dog("Sammy",123,jack);
        sammy.sayName();
        Dog bello = new Dog("Bello", 50);
        bello.sayName();
    }
}