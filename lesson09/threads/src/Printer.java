public class Printer extends Thread {
    private String word;

    public Printer(String word) {
        this.word = word;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(word);
        }
    }
}
