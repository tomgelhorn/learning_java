public class Fruit implements Comparable<Fruit>{
    protected String kind;

    public Fruit(String kind){
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public int compareTo(Fruit otherFruit) {
        return this.kind.compareTo(otherFruit.kind);
    }
}
