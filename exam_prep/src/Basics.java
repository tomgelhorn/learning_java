import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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




}
