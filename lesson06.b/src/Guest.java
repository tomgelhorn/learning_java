public class Guest {
    private String name;
    private int age;

    public Guest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void petAllAnimals(Zoo z){
        for(int i = 0; i < z.getAnimals().size(); i++){
            if(z.getAnimal(i) instanceof Pettable){
                ((Pettable) z.getAnimal(i)).pet();
            }
        }
    }
}
