public class Exceptions {

    private String[] values = new String[]{"First",
            "Second", "Third"};
    public String lookUpValue(int index) {
        if(index > 3){
            throw new IndexOutOfBoundsException();
        }
        return values[index];
    }
    public void run() {
        System.out.println(lookUpValue(0));
        System.out.println(lookUpValue(2));
        System.out.println(lookUpValue(4));
        System.out.println("After out of bounds.");
    }

    public void tryValue(int index){
        System.out.println("Look up: " + index);
        try{
            System.out.println(lookUpValue(index));
        }
        catch(IndexOutOfBoundsException e){

            System.out.println("Index not found");
        }
        finally {
            //Do unconditionally
            System.out.println("End of Command");
        }
    }

    public void ThrowValue(int index) throws Exception{
        System.out.println("Look up (>0): " + index);
        if(index <= 0){
            throw new Exception("ERR: Index must be greater than 0 !");
        }
    }

    public void CustomErr(int index) throws XtraException{
        if(index < 3){
            throw new XtraException(index);
        }
    }

}
