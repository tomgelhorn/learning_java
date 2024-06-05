public class Goat extends Animal implements Pettable{
    public Goat(String name) {
        super(name);
    }

    @Override
    public String getBreed() {
        return "Goat";
    }

    @Override
    public void pet() {
        System.out.println("baa");
    }
}
