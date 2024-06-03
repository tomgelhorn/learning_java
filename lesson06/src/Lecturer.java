public class Lecturer extends Human{
    Lecturer(String name, int age){
        super(name, age);
    }

    @Override
    public void doJob(){
        System.out.println("Teaching...");
    }

    public void answerQuestion(String question){
        System.out.println("Answering question: " + question);
    }

    @Override
    public String toString(){
        return "Lecturer:" + super.toString();
    }

}
