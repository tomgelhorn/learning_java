import java.util.ArrayList;
import java.util.List;

public class Generics<S> {
    private S content;
    public <T> void printAnything(T value){
        System.out.println(value);
    }

    public <R> void printAnything(R value1, R value2, R value3){
        System.out.println(value1 + ", " + value2 + ", " + value3);
    }

    public void setContent(S content) {
        this.content = content;
    }

    public S getContent(){
        return content;
    }

    //Wildcard
    public void printList(List<?> list){
        System.out.println(list);
    }

    // Upperbound

    public <T extends Number> int sum(List<T> list){
        int sum = 0;
        for(T t : list){
            sum += t.intValue();
        }
        return sum;
    }

    // Lower bound

    public void addElement(ArrayList<? super Integer> liste){
        liste.add(25);
    }
}
