
package Lab10;
import java.util.*;
class ZeroNumberException extends Exception{
    public ZeroNumberException(String str){
        super(str);
    } 
}

public class Q4{
    static void zero_check(int num)throws ZeroNumberException{
        if(num == 0)
            throw new ZeroNumberException("Zero Entered");
        else
            System.out.println("Nice Number");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
       try{
            zero_check(num);
       }catch(ZeroNumberException e){
           System.out.println("Exception occured: " + e);  
       }
        
    }
}
