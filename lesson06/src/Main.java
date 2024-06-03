public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Human Stuff:");

        Human Dil = new Human("Dil", 14);
        Lecturer Duc = new Lecturer("Duc", 25);
        Researcher Dom = new Researcher("Dom", 29);

        System.out.println("List of humans:");
        System.out.println(Dil.toString());
        System.out.println(Duc.toString());
        System.out.println(Dom.toString());

        System.out.println("\nSend humans to work");
        Dil.doJob(); //unemployed
        Duc.doJob();
        Dom.doJob();

    }
}