package animals;

public class Cat extends Animal {
    private boolean outdoor;

    public Cat(String name, int size, boolean outdoor) {
        super(name, size);
        this.outdoor = outdoor;
    }


    public boolean isOutdoor() {
        return outdoor;
    }
    public void meow(){
        System.out.println("Meow");
    }

    @Override
    public void makeNoise(){
        meow();
    }
}
