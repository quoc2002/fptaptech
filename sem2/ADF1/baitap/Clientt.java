
/**
 *write a description of class Client here. 
 * 
 * @author(your name)
 * @version (a)
 */
public class Clientt {
    /**
     * Constructor for objects of class Client
     */
    public Clientt(){
        //To do
    }

    public void doUnchecked(String value){
        //Can phai check exception, ney khong --> bug
        int result=canThrowUncheckedException(value);
        System.out.println("result="+result);
    }

    private int canThrowUncheckedException(String value){
        return Integer.parseInt(value);
    }

    public void doChecked(){
        try{
            //Buoc phai check exception o day! khong cach nao khac
            canThrowCheckedException();
            System.out.println("OK");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    private int canThrowCheckedException() throws Exception{
        throw new Exception("Failure");
    }
}
//Distinguishing unchecked Checked Exception and Exception?
//Using Checkes Exception and use unchecked Exception?
//Why should not catch ((Exception ex))?