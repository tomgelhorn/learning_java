public class ResearchGrant{
    private Researcher researcher;

    public ResearchGrant(Researcher r){
        researcher = r;
    }
    public void startAction(String target){
        if(target.equals("")){
            researcher.doJob();
        }
        else{
            researcher.goToConference(target);
        }
    }
}
