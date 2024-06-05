public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Tiger tiger = new Tiger("Tigger");
        Goat goat = new Goat("LeBron James");
        Goat goat1 = new Goat("Rick Astley");
        Tiger tiger1 = new Tiger("Karsten Stahl");

        zoo.addAnimal(tiger);
        zoo.addAnimal(goat);
        zoo.addAnimal(goat1);
        zoo.addAnimal(tiger1);

        Guest guest = new Guest("Gustav Gans", 69);

        zoo.addGuest(guest);


        //Testing

        System.out.println("Petting the LeBron James");
        goat.pet();

        System.out.println("Petting all animals");
        guest.petAllAnimals(zoo);

        System.out.println("What are the animals in my zoo");
        for(int i = 0; i < zoo.getAnimals().size(); i++){
            System.out.println(zoo.getAnimal(i).getBreed());
            }
        }
    }