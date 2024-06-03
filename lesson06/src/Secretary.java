public class Secretary implements Worker{
    private Worker worker;
    public Secretary(Worker w){
        worker = w;
    }

    public void doJob(){
        worker.doJob();
    }

    public void askWorkerQuestion(String question){
        if(worker instanceof Lecturer){
            Lecturer l = (Lecturer) worker;
            l.answerQuestion(question);
        }
    }

    public void setWorker(Worker w){
        worker = w;
    }

    public void startAction(){
        worker.doJob();
    }
}
