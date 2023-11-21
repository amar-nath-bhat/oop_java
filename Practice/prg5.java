package Practice;

import java.util.Scanner;

public class prg5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        String s[] = new String[100];
        System.out.println("Enter the string :");
        while(true){
            s[i]=sc.nextLine();
            if(s[i].equalsIgnoreCase("0")){
                s[i]=null;
                i--;
                break;
            }
            i++;
        }
        s=sort(s, i+1);
        for(int j=0; j<=i; j++)
            System.out.println(s[j]);

    }

    static String[] sort(String s[], int size){
        for(int i=0;i<size-1;i++){
            for(int j=0; j<size-i-1; j++){
                if(s[j].compareTo(s[j+1]) >0){
                    String temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
                
        }
        return s;
    }
}