import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;
    private ArrayList<Guest> guests;

    public Zoo() {
        animals = new ArrayList<>();
        guests = new ArrayList<>();
    }
    public void addAnimal(Animal a) {
        animals.add(a);
    }
    public void addGuest(Guest g) {
        guests.add(g);
    }
    public Animal getAnimal(int i) {
        return (Animal) animals.get(i);
    }
    public Guest getGuest(int i) {
        return (Guest) guests.get(i);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

}
