// Design a class Input_Exception for validating an input taken from the user during
// runtime and continue to perform the sum of the numbers entered until a -1 is input.
// In case the user enters a -1, the sum is calculated and displayed. In case the user
// enters any floating point numbers, then the method that takes the input should
// raise the user defined exception and the same should be handled in the main.

package Practice;
import java.util.Scanner;
class Input_Exception extends Exception{
    Input_Exception(String str){
        super(str);
    }
}
public class prg9 {
    public static void main(String[] args) throws Input_Exception{
        Scanner sc = new Scanner(System.in);
        int sum=0;
        String num;

        while(true){
            try{
                num = sc.nextLine();
                double number = Double.parseDouble(num);
                if(number%1 !=0)
                    throw new Input_Exception("Float or double not allowed!");
                if(number==-1)
                    break;
                sum+=number;
                
            }catch(Input_Exception e){
                System.out.println(e);
                continue;
            }
        }
        System.out.println("Sum is : "+sum);
    }
}
