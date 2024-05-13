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
    public static void main(String[] args) {
        System.out.println("Running dog shelter main - part 1");
        String[] names = {
                "Emma", "Bello", "Timmy", "Harald", "Susi"
        };
        Shelter shelter = new Shelter(names.length);
        for (int i = 0; i < names.length; i++) {
            Dog dog = new Dog(names[i], (int)(random()*100+30));
            shelter.addDog(dog);
        }

        //Search Test

        Dog doggo = shelter.getDog("Timmy");
        Main.strTest(doggo);
        doggo = shelter.getDog("Tommy");
        Main.strTest(doggo);

        //Size Test

        doggo = shelter.getDog(69);
        if (doggo != null) {
            System.out.println("I found " + doggo.getName() + ", with size: "+ doggo.getSize());
        }
        else{
            System.out.println("No Dog found");
        }

        // Substring test

        doggo = shelter.getDog("mm");
        Main.strTest(doggo);
        doggo = shelter.getDog("usi");
        Main.strTest(doggo);

        // Shelter overload
        Dog dog = new Dog("Sarah", (int)(random()*100+30));
        shelter.addDog(dog);

        shelter.print();
    }
}