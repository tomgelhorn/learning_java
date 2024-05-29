public class Cat {
    private String name;
    private int size;
    private boolean outdoor;

    public Cat(String name, int size, boolean outdoor) {
        this.name = name;
        this.size = size;
        this.outdoor = outdoor;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isOutdoor() {
        return outdoor;
    }
    public void meow(){
        System.out.println("Meow");
    }
}
