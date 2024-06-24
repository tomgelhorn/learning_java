public class Cherry extends Fruit{
    public Cherry(String kind) {
        super(kind);
    }

    @Override
    public String toString(){
        return "Cherry of kind: " + this.getKind();
    }

}
