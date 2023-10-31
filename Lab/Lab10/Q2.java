package Lab10;

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        try{
            int a[] = new int[10];
            Scanner sc = new Scanner(System.in);
            for(int i=0; i<10; i++)
                a[i]=i;
            System.out.print(a[11]+" ");
        }catch(Exception e){
            System.out.println("" +e);
        }
    }
}
