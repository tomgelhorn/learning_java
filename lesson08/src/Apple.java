public class Apple extends Fruit{
    public Apple(String kind) {
        super(kind);
    }

    @Override
    public String toString() {
        return "Apple of kind " + kind;
    }
}
