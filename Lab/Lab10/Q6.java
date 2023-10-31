
package Lab10;

import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String str){
        super(str);
    } 
}

public class Q6{
    static void neg_check(double num)throws NegativeNumberException{
        if(num < 0)
            throw new NegativeNumberException("Cannot Find Root of Negative Number");
    }
    
    static double sqrt(double num){
        return Math.pow(num, 0.5);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double num = sc.nextDouble();
        try{
           neg_check(num);
           System.out.println(sqrt(num));
        }
        catch(NegativeNumberException e){
           System.out.println("Exception occured: " + e);  
       }
        
    }
}
