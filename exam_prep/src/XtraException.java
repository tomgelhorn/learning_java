public class XtraException extends Exception {
    private int errCode;

    public XtraException(int errCode) {
        this.errCode = errCode;
    }

    public void printCriticality(){
        if(errCode == 1){
            System.out.println("Critical Error");
        }
        else if(errCode == 2){
            System.out.println("Non Critical Error");
        }
        else{
            System.out.println("Error");
        }
    }
}
