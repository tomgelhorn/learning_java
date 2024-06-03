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

        System.out.println("\nHumans with job, do their job");
        Duc.answerQuestion("Is mayonaise an instrument?");
        Dom.goToConference("How to create integer");

        System.out.println("\nDo shit");

        Student Tom = new Student(Duc);
        Tom.startAction("Yeet?");

        ResearchGrant Moritz = new ResearchGrant(Dom);
        Moritz.startAction("Atombombe");

        System.out.println("\nTell Susi to do her job!");
        Secretary Susi = new Secretary(Duc);
        Susi.doJob();
    }
}