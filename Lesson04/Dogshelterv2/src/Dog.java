public class Dog {
    private int size;
    private String name;

    public Dog(String name, int size) {
        this.size = size;
        this.name = name;
    }


    public String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }
    public void bark(){
        if (size >= 120){
            System.out.println("Ruff Ruff");
        }
        else{
            System.out.println("Wuff wuff");
        }
    }

}
