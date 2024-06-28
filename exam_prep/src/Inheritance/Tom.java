package Inheritance;

public class Tom extends Human{
    public Tom(int age, String name){
        super(name, age);
    }

    public void ageCheck(){
        if(age < 18){
            System.out.println(name + " is a minor");
        }
        else{
            System.out.println(name + " is a grown up");
        }
    }
}
