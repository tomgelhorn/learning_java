package animals;

public class Animal {
    protected String name;
    protected int size;

    protected Animal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void makeNoise(){
        System.out.println("*cricket sounds*");
    }
}
