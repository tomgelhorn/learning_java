public class Main {
    public static void main(String[] args) {
        /*Printer helloPrinter = new Printer("Hello");
        Printer worldPrinter = new Printer("World");

        helloPrinter.start();
        worldPrinter.start();
        */

        Counter myCounter = new Counter();
        Thread thread1 = new Thread(myCounter);
        Thread thread2 = new Thread(myCounter);
        Thread thread3 = new Thread(myCounter);

        thread1.start();
        thread2.start();
        thread3.start();



    }
}