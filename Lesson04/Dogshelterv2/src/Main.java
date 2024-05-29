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

        //Name Search Test
        System.out.println("--- Testing: Search by Name ---");
        System.out.println("Searching for: Timmy");
        Dog doggo = shelter.getDog("Timmy");
        Main.strTest(doggo);
        System.out.println("Searching for: Tommy");
        doggo = shelter.getDog("Tommy");
        Main.strTest(doggo);

        //Size Search Test
        System.out.println("--- Testing: Search by Size ---");
        System.out.println("Searching for dog with size greater than: 69");
        doggo = shelter.getDog(69);
        if (doggo != null) {
            System.out.println("I found " + doggo.getName() + ", with size: "+ doggo.getSize());
        }
        else{
            System.out.println("No Dog found");
        }

        // Substring Search Test

        doggo = shelter.getDog("mm");
        Main.strTest(doggo);
        doggo = shelter.getDog("usi");
        Main.strTest(doggo);

        // Shelter overload
        Dog dog = new Dog("Sarah", (int)(random()*100+30));
        shelter.addDog(dog);

        //Testing Exeptions

        try {
            shelter.addDog(null);
            shelter.addDog(new Dog(null, 60));
            shelter.addDog(new Dog("", 60));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shelter.addDog(new Dog("Berry", 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        shelter.print();

        //Test Hash
        Dog testDog = new Dog("Jürgen", 112);
        Employee First = new Employee("Tom", 1);
        Employee Second = new Employee("Lena", 2);
        shelter.assignCaretaker(testDog, First);
        shelter.assignCaretaker(testDog, Second);

    }
}