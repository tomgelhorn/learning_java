public class Student{
    private Lecturer lecturer;

    public Student(Lecturer l){
        lecturer = l;
    }
    public void startAction(String target){
        if(target.equals("")){
            lecturer.doJob();
        }
        else{
            lecturer.answerQuestion(target);
        }
    }
}
