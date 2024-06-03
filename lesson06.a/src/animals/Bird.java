package animals;

public class Bird extends Animal{
    private boolean talker;
    private int highestAltitude;

    public Bird(String name, int size, boolean talker, int highestAltitude) {
        super(name, size);
        this.talker = talker;
        this.highestAltitude = highestAltitude;
    }
    public boolean fly(int altitude){
        return altitude <= highestAltitude;
    }

    public boolean isTalker() {
        return talker;
    }

    @Override
    public void makeNoise(){
        if(talker){
            for (int i = 0; i<10; i++){
                System.out.println("chirp");
            }
        }
        else{
            System.out.println("chirp");
        }
    }

}
