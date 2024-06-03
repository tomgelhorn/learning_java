public class Secretary implements Worker{
    private Worker worker;
    public Secretary(Worker w){
        worker = w;
    }

    public void doJob(){
        worker.doJob();
    }

    public void startAction(){
        worker.doJob();
    }
}
