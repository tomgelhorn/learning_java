package Inheritance;

public class Human extends Animal{
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void scream() {
        System.out.println("Ahhhhh");
    }
}
