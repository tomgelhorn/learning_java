public class Main {
    public static void main(String[] args) {
        System.out.println("Running dog shelter main - part 1");
        String[] names = {
                "Emma", "Bello", "Timmy", "Harald", "Susi"
        };
        Shelter shelter = new Shelter(names.length);
        for (int i = 0; i < names.length; i++) {
            Dog dog = new Dog(names[i], 70);
            shelter.addDog(dog);
        }
        shelter.print();
    }
}