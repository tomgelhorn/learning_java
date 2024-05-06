public class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}
