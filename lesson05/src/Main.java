import static java.lang.Math.random;

public class Main {
    public static void strTest(Dog dog){
        if (dog != null) {
            System.out.println("I found " + dog.getName());
        }
        else{
            System.out.println("No Dog found");
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Running dog shelter main - part 1");
        String[] names = {
                "Emma", "Bello", "Timmy", "Harald", "Susi"
        };
        Shelter shelter = new Shelter();
        for (int i = 0; i < names.length; i++) {
            Dog dog = new Dog(names[i], (int)(random()*100+30));
            shelter.addDog(dog);
        }
        shelter.print();

        //Hamster Cat Test

        Cat kitty = new Cat("Kitty", 90, true);
        Hamster Hamy = new Hamster("Hamy", 15, "Burger");
        //Let Kitty say meow
        kitty.meow();
        //Check Hamster fav food
        Hamy.eatFood("Hotdog");
        Hamy.eatFood(Hamy.getFavoriteFood());
    }
}