package animals;

public abstract class Animal {
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

    public abstract void makeNoise();

}
