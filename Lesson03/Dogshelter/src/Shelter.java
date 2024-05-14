public class Shelter {
    private int count;
    private int capacity;
    private Dog[] dogs;

    public Shelter(int capacity) {
        this.capacity = capacity;
        count = 0;
        dogs = new Dog[this.capacity];
    }

    public void addDog(Dog dog) {
        if (count < capacity) {
            dogs[count] = dog;
            count++;
        } else {
            Dog[] temp = dogs;
            dogs = new Dog[capacity * 2];
            capacity = capacity * 2;
            System.out.println("Doubled shelter capacity: " + capacity);
            for (int i = 0; i < temp.length; i++) {
                dogs[i] = temp[i];
            }
            dogs[count] = dog;
            count++;
            System.out.println("Added Dog: " + dog.getName());
        }
    }

    public void print() {
        System.out.print("Capacity: " + capacity + ", Count: " + count + ", Dogs: ");
        for (int i = 0; i < count; i++) {
            System.out.print(dogs[i].getName() + "(Size: " + dogs[i].getSize() + "), ");
        }
        System.out.println();
    }
/*
    public Dog getDog(String name) {
        for (int i = 0; i < count; i++) {
            if (dogs[i].getName().equals(name)) {
                return dogs[i];
            }
        }
        return null;
    }
*/
    public Dog getDog(String name) {
        for (int i = 0; i < count; i++) {
            if (dogs[i].getName().contains(name)) {
                System.out.println("Adopting Dog: " + dogs[i].getName());
                Dog adopted = dogs[i];
                for (int j = i; j < count-1; j++) {
                       dogs[j] = dogs[j + 1];
                }
                count--;
                return adopted;
            }
        }
        return null;
    }
    public Dog getDog(int minSize) {
        for (int i = 0; i < count; i++) {
            if (dogs[i].getSize() >= minSize) {
                System.out.println("Adopting Dog: " + dogs[i].getName());
                Dog adopted = dogs[i];
                for (int j = i; j < count-1; j++) {
                    dogs[j] = dogs[j + 1];
                }
                count--;
                return adopted;
            }
        }
    return null;
    }
}
