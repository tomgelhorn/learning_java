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
            return;
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
                return dogs[i];
            }
        }
        return null;
    }
    public Dog getDog(int minSize) {
        for (int i = 0; i < count; i++) {
            if (dogs[i].getSize() >= minSize) {
                return dogs[i];
            }
        }
    return null;
    }
}
