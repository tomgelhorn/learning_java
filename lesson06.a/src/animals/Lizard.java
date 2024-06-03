package animals;
import static java.lang.Math.random;

public class Lizard extends Animal {
    private String color;
    private boolean poisonous;

    public Lizard(String name, int size, String color, boolean poisonous) {
        super(name, size);
        this.color = color;
        this.poisonous = poisonous;
    }

    public boolean defend(){
        int defense = (int)(random()*100);
        System.out.println("Defense Probability: "+defense);
        if(poisonous){
            if(defense >= 25){return true;}
        }
        else{
            if(defense >= 75){return true;}
        }
        return false;

    }

    @Override
    public void makeNoise() {
        System.out.println("*cricket noise*");
    }

    public boolean isPoisonous() {
        return poisonous;
    }
}
