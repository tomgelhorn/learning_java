public class Human {
    private String name;
    private int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doJob(){
    }


    @Override
    public String toString() {
        return "Age: " + age + " Name: " + name;
    }
}
