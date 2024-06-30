import java.util.*;
import java.util.stream.Stream;

public class Basics {
    private int[] id = {1,2,3,4,5,6,7,8,9,10};
    public void advFor(){
        System.out.println("Printing every ID:");
        for(int ids : id){
            System.out.print(ids + ", ");
        }
        System.out.println();
    }

    public void advFor(char c){
        System.out.println("Printing every ID:");
        for(int ids : id){
            System.out.print(ids + "" + c + " ");
        }
        System.out.println();
    }

    //Arraylist

    private ArrayList<Integer> arrList = new ArrayList<>();
    public void printList(){
        for(int i = 0; i < arrList.size(); i++){
            System.out.print(arrList.get(i) + ", ");
        }
        System.out.println();
    }

    public void addList(int i){
        arrList.add(i);
        System.out.println("Added " + i + " to the list");
    }

    public void removeList(int i){
        arrList.remove(i);
        System.out.println("Removed " + i + " from the list");
    }

    // Hashmap

    HashMap<Integer, Integer> map = new HashMap<>();

    public void addMap(int i, int j){
        map.put(i, j);
    }

    public void printHashMap(int i){
        System.out.println(map.get(i));
    }

    // Streams
    public void stream() {
        List<Integer> years = Arrays.asList(2005, 1999, 2000, 1945, 1969, 2023);
        years.forEach(yeet -> System.out.println(yeet));

        // Print all ages
        years.stream()
                .filter(y -> y < 2006)
                .map(y -> 2024-y)
                .forEach(y -> System.out.println(y));

        // Print combined age
        int age = years.stream()
                .map(y -> 2024-y)
                .reduce(0, (a, b) -> a + b);
        System.out.println("Combined age: " + age);
    }

    public void arrStream(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int res = Arrays.stream(arr)
                .filter(a -> a > 5)
                .map(a -> a%2)
                .reduce(0, (a, b) -> a+b);
        System.out.println("Calc: " + res);
    }

    public void fastStream(){
        int res = Stream.of(1,3,5,6,7,8,9,69)
                .filter(yeet -> (yeet%69)==0)
                .map(yeet -> (yeet+420-69))
                .reduce(0, (a, b) -> a+b);
        System.out.println("420: " + res);

    }

    //Enums for Constants
    public void Counties(County land){
        switch (land){
            case NRW -> System.out.println("NRW diggi");
            case Berlin -> System.out.println("Hauptstadt vallah");
            case Bayern -> System.out.println("Gimme Bier");
            case Hessen -> System.out.println("Äppelwoi");
            case Thüringen -> System.out.println("Rostbratwürstchen");
        }
    }


}
