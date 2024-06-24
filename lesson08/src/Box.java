public class Box<T extends Comparable< ? super T >> {
    private String name;
    private T content;

    public Box(String name, T content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public int compareContent(Box<T> otherBox) {
        return this.content.compareTo(otherBox.getContent());
    }


    @Override
    public String toString() {
        return "Box " + name + " has " + content;
    }
}
