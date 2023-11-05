/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;
import java.util.*;
public class Menu1 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean flag=true, cont =true;
        String string;
        System.out.println("Enter the string: ");
        string= sc.nextLine();
        
        
        while(cont)
        {
            System.out.println("Enter your choice: 1. Palindrome Check 2. Alphabetical Order 3. Reverse 4. Conncat original and Reverse");
            choice = sc.nextInt();
            switch(choice)
            {
                
                case 1: 
                    flag = IsPalindrome(string);
                    if(flag)
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");
                    break;

                case 2:
                    System.out.println("New String In Alphabetical Order is : "+AlphaOrder(string));
                    break;

                case 3: 
                    System.out.println("Reversed String is : "+reverse(string)); 
                    break;

                case 4:
                    System.out.println("Concated String is : "+string.concat(reverse(string)));
                    break;
                    
                default: cont =false;
            }
            
        }
        
    }
    
    static boolean IsPalindrome(String string)
    {
        for(int i=0;i<string.length();i++)
            if(string.charAt(i)!=string.charAt(string.length()-i-1))
                return false;
        return true;
    }
    
    static String AlphaOrder(String string)
    {
        char newString[]=string.toCharArray();
        char temp;
        for(int i=0;i<string.length();i++)
        {
            for(int j=i+1;j<string.length();j++)
            {
               if(newString[i]>newString[j])
               {
                   temp = newString[i];
                   newString[i]=newString[j];
                   newString[j]=temp;
               }
            }
        }
        return Arrays.toString(newString);
    }
    
    static String reverse(String string)
    {
        StringBuffer BString = new StringBuffer();
        BString.append(string);
        BString.reverse();
        return BString.toString();
    }
}
