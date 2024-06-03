public class Researcher extends Human implements Worker{
    Researcher(String name, int age) {
        super(name,age);
    }

    @Override
    public void doJob() {
        System.out.println("Researching...");
    }

    public void goToConference(String destination){
        System.out.println("Going to " + destination );
    }

    @Override
    public String toString(){
        return "Researcher: " + super.toString();
    }
}
