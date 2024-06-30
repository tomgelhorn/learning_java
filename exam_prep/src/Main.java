import Inheritance.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Welcome to Tom's Exam Machine! ---");

        // Uncomment the Methods you need
        boolean basics = false;
        boolean strings = false;
        boolean packages = false;
        boolean exceptions = false;
        boolean inheritance = false;
        boolean generics = false;
        boolean threads = true;

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

            System.out.println("Testing Streams");
            basic.stream();
            basic.arrStream();
            basic.fastStream();

            System.out.println("Testing Enums & Switch case");
            basic.Counties(County.Bayern);
            basic.Counties(County.Thüringen);

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


            // String Buffer (thread safe)

            StringBuffer strbuff = new StringBuffer("Tom says: ");
            strbuff.append(c);
            System.out.println(strbuff);
            strbuff.insert(3, " never");
            System.out.println(strbuff);

            // String Builder (not thread safe, but faster)
            StringBuilder strbuil = new StringBuilder("Tim says: ");
            strbuil.append(a);
            System.out.println(strbuil);
            strbuil.insert(3, " never");
            System.out.println(strbuil);
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
            // Upcasting:
            Human tom = new Tom(19, "Tom");
            // No access to Functions of Tom-Class
            // Downcast ->
            Tom tommi = (Tom) tom;
            tommi.ageCheck();

            System.out.println("Checking inheritance");
            if(tommi instanceof Human){
                System.out.println("Tommi is a human!");
            }

            System.out.println("Testing Interface");
            tommi.feed("Burger");

            System.out.println("Testing abstract Classes");
            tom.drink();
            tommi.scream();


        }

        if(generics){
            Generics gen = new Generics();
            Tom rndHooman = new Tom(12, "Hooman");
            gen.printAnything("Hey");
            gen.printAnything("Hey", true, 69);

            gen.setContent(rndHooman);
            System.out.println(gen.getContent());
            Tom test = (Tom) gen.getContent();
            test.ageCheck();

            List<String> names = new ArrayList<>();
            names.add("Tom");
            names.add("Max");
            gen.printList(names);


            List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
            System.out.println(gen.sum(list));
            //Function takes int and double
            List<Double> list1 = Arrays.asList(1.9,2.1,3.9,4.2,5.2,6.2,7.2,8.2,9.2,11.99);
            System.out.println(gen.sum(list1));


            ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
            //Add 25
            gen.addElement(list2);
            System.out.println(gen.sum(list2));
        }

        if(threads){
            Thread thread1 = new Threads();
            thread1.start();
        }
    }
}