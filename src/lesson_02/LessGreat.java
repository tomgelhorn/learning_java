package lesson_02;

public class LessGreat {
    public static void main(String[] args) {
        calc myCalc = new calc();
        System.out.println("Subtracting 2 - 1:  "+ myCalc.sub(2,1));
        System.out.println("Adding 2 + 1:   "+ myCalc.add(2,1));
        System.out.println("Multiplying 2 * 1:  "+ myCalc.mul(2,1));
        System.out.println("Dividing 2 / 1:     "+ myCalc.div(2,1));
        System.out.println("Greater? 2/1:     "+ myCalc.isGreaterThan(2,1));
        System.out.println("Less? 2/1:     "+ myCalc.isLessThan(2,1));
    }
}

class calc{
    int sub( int a, int b ){
        return a - b;
    }
    int add( int a, int b ){
        return a + b;
    }
    int mul( int a, int b ){
        return a * b;
    }
    int div( int a, int b ){
        return a / b;
    }
    boolean isGreaterThan(int a, int b ){
        return a > b;
    }
    boolean isLessThan( int a, int b ){
        return a < b;
    }
}
