public class Pair<T extends Comparable< ? super T >> {
    private T value1;
    private T value2;

    public Pair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }

    public int compareTo(T val) {
        return value1.compareTo(val);
    }



    public void swap() {
        T temp = value1;
        value1 = value2;
        value2 = temp;
    }

    public int compareValues(){
        return compareTo(value2);
    }

    public T max(){
        if(compareTo(value2) >= 1){
            return value1;
        }
        return value2;
    }

    public T min(){
        if(compareTo(value2) <= -1){
            return value1;
        }
        return value2;
    }
}
