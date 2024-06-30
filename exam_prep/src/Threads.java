public class Threads extends Thread{
    private int count;

    @Override
    public void run() {
        count++;
    }

    //Synchronize = only thread can access it at once

    public synchronized void increment(){
        count++;
    }

    //or

    public void sIncrement(){
        synchronized(this){
            count++;
        }
    }


}
