import java.io.FileNotFoundException;
import java.io.IOException;

public class Main{
    public static void main(String args[]){
        BadDayException ex = new BadDayException("Error");
            ex.methodOne();
            ex.methodTwo();
            ex.methodThree();
    }
}

class BadDayException extends Exception{
    public BadDayException(String errMsg){
        super(errMsg);
    }
    public void methodOne () {
        try{
            throw new BadDayException("It's been a rough day");
        }catch(BadDayException err){
            System.out.println(err);
        }finally{
            System.out.println("Hello Exceptions");
        }
    }
    public void methodTwo () {
        try{
            throw new IOException(":((");
        }catch(IOException err){
            System.out.println(err);
        }finally{
            System.out.println("Hello Exceptions");
        }
    }
    public void methodThree () {
        try{
            throw new FileNotFoundException(":'(");
        }catch(FileNotFoundException err){
            System.out.println(err);
        }finally{
            System.out.println("Hello Exceptions");
        }
    }
}
