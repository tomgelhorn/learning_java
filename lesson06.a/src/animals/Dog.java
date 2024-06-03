package animals;

public class Dog extends Animal{

    public Dog(String name, int size) {
        super(name, size);
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

    @Override
    public void makeNoise(){
        bark();
    }

}
