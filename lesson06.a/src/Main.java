import animals.*;

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

        //Inheritance
        System.out.println("Running Inheritance Checks");

        Cat kitty = new Cat("Kitty", 90, true);
        Hamster hamy = new Hamster("hamy", 15, "Burger");
        //Let Kitty say meow
        kitty.meow();
        //Check Hamster fav food
        hamy.eatFood("Hotdog");
        hamy.eatFood(hamy.getFavoriteFood());

        System.out.println("\nRunning Lizard defense test No1");
        Lizard lizzo = new Lizard("Lizzo", 120, "blue", true);
        if(lizzo.defend()){
            System.out.println(lizzo.getName() + " is poisonous and killed the opponent!");
        }
        else{
            System.out.println(lizzo.getName() + " is poisonous but failed to defend you!");
        }
        System.out.println("\nRunning Lizard defense test No2");
        Lizard jeffry = new Lizard("Jeffry", 120, "blue", false);
        if(jeffry.defend()){
            System.out.println(jeffry.getName() + " is not poisonous and surprisingly killed the opponent!");
        }
        else{
            System.out.println(jeffry.getName() + " is not poisonous and obviously failed to defend you!");
        }
        Bird tweet = new Bird("Tweet", 12, true, 420);
        Dog hundi = new Dog("Hundi", 90);
        System.out.println("\nCrazy man talks to Animals:");
        System.out.println("Hello Bird:");
        tweet.makeNoise();

        System.out.println("Hello Lizard:");
        jeffry.makeNoise();

        System.out.println("Hello Cat:");
        kitty.makeNoise();
        
        System.out.println("Hello Hamster:");
        hamy.makeNoise();

        System.out.println("Hello good boi:");
        hundi.makeNoise();

        System.out.println("\nDemand Bird to fly to the cell tower:");
        if(tweet.fly(300)){
            System.out.println("Tweety got the best cell service");
        }
        else{
            System.out.println("Tweety is not going to fly to the cell tower");
        }

        System.out.println("\nDemand Bird to fly to the moon:");
        if(tweet.fly(485749)){
            System.out.println("Tweety flew to the moon");
        }
        else{
            System.out.println("Tweety died on the way to the moon");
        }
    }
}