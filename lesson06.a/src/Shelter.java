import animals.Dog;

import java.util.ArrayList;
import java.util.HashMap;

public class Shelter {
    private ArrayList<Dog> dogs;
    public HashMap<Dog, Employee> hash;

    public Shelter() {
        dogs = new ArrayList<Dog>();
        hash = new HashMap<>();
    }

    public void addDog(Dog dog) throws Exception {
        if (dog == null || dog.getName() == null || dog.getName().equals("")) {
            throw new Exception("Dog is null!");
        }
        if(dog.getSize() <= 0){
            throw new Exception("Dog size is invalid!");
        }
        dogs.add(dog);

        System.out.println("Added dog: " + dog.getName());
        }


    public void print() {
        System.out.print("Current dog Count: " + dogs.size()+"\n");
        for (int i = 0; i < dogs.size(); i++) {
            System.out.print("Dogs inside: "+dogs.get(i).getName() + "(Size: " + dogs.get(i).getSize() + "), ");
        }
        System.out.println();
    }
/*
    public Animals.Dog getDog(String name) {
        for (int i = 0; i < count; i++) {
            if (dogs[i].getName().equals(name)) {
                return dogs[i];
            }
        }
        return null;
    }
*/
    public Dog getDog(String name) {
        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getName().contains(name)) {
                System.out.println("Adopting dog: " + dogs.get(i).getName());
                Dog temp = dogs.get(i);
                dogs.remove(i);
                return temp;
            }
        }
        return null;
    }
    public Dog getDog(int minSize) {
        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getSize() >= minSize) {
                System.out.println("Adopting dog: " + dogs.get(i).getName());
                Dog temp = dogs.get(i);
                dogs.remove(i);
                return temp;

            }
        }
    return null;
    }

    public Employee getCaretaker(Dog dog){
        if (dog == null) return null;
        return hash.get(dog);
    }

    public void assignCaretaker(Dog dog, Employee employee){

        if (getCaretaker(dog) == null){
            hash.put(dog, employee);
            System.out.println("Assigned " + getCaretaker(dog).getName() +" to: " + dog.getName());
        }
        else if(getCaretaker(dog).getId() == employee.getId()){
            System.out.println("Caretaker switch from:" + getCaretaker(dog).getName() + " to " + employee.getName());
        }
    }
}
