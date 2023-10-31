package Lab10;
import java.util.*;
public class Q1 {
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            String num = sc.nextLine();
            int a = Integer.parseInt(num);
            a++;
            System.out.println(a);
        }catch(Exception e){
            System.out.println("" +e);
        }
    }
}
