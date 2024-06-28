import Inheritance.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Welcome to Tom's Exam Machine! ---");

        // Uncomment the Methods you need
        boolean basics = false;
        boolean strings = false;
        boolean packages = false;
        boolean exceptions = false;
        boolean inheritance = false;

        if (basics) {
            Basics basic = new Basics();

            // Advanced for-loop
            basic.advFor();

            // Method overload

            basic.advFor(';');

            //ArrayList
            basic.addList(1);
            basic.addList(44);
            basic.addList(55);
            basic.addList(69);
            basic.printList();
            basic.removeList(3);
            basic.printList();

            //Hashmap

            basic.addMap(1, 69);
            basic.addMap(3, 420);
            basic.addMap(6,666);

            basic.printHashMap(1);

        }
        if(packages){

            /* Random numbers */
            Packages random = new Packages();

            //Double Random
            System.out.println("Random double: " + random.rnd());

            //Int Random
            System.out.println("Random int: " + random.irnd());

            //Advanced Random 8-20
            System.out.println("Advanced random (8-20): " + random.advrnd());

        }
        if (strings) {
            /* Strings */
            Strings string = new Strings();
            String a = "Hi Tom";
            String b = "Hi Tom";
            String c = "Hi Tim";

            // String Compare
            System.out.println("Hi Tom = Hi Tom: " + string.comp(a, b));
            System.out.println("Hi Tom = Hi Tim: " + string.comp(a, c));

            // String contains

            System.out.println("Hi Tom contains Hi: " + string.cont(a, "Hi"));
            System.out.println("Hi Tom contains Bye: " + string.cont(a, "Bye"));
        }
        if (exceptions) {
            /* Exceptions */

            Exceptions demo = new Exceptions();

            //Exception Throw example

            //demo.run();
            //System.out.println("After run.");

            //Exception Catch example

            demo.tryValue(0);
            demo.tryValue(5);

            //New Exception
            try {
                demo.ThrowValue(1);
                demo.ThrowValue(0);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            // Custom Exception

            try{
                demo.CustomErr(2);
            }
            catch (XtraException e){
                e.printCriticality();
            }

        }

        if(inheritance){
            Tom tom = new Tom(19, "Tom");
            tom.ageCheck();
        }
    }
}