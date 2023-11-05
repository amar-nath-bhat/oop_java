/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;
import java.util.*;
public class Menu2 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        int choice;
        String s1, s2;
        
         
        
        while(cont)
        {
            System.out.println("Enter your choice: 1. Compare 2 Strings 2. Case Toggle 3. Check Substring 4. Check SUbstring & replace ->hello<-");
            choice = sc.nextInt();
            switch(choice)
            {
                
                case 1: 
                    System.out.println("Enter String 1: ");
                    s1=sc.next();
                    System.out.println("Enter String 2: ");
                    s2=sc.next();
                    if(s1.compareTo(s2)==0)
                        System.out.println("String 1 & 2 are equal: ");
                    else if(s1.compareTo(s2)>0)
                        System.out.println("String 1 & 2 are unequal and String 1 > String 2: ");
                    else
                        System.out.println("String 1 & 2 are unequal and String 1 < String 2: ");
                    break;

                case 2:
                    System.out.println("Enter String: ");
                    s1=sc.next();
                    System.out.println(toggle(s1));
                    break;

                case 3: 
                    System.out.println("Enter String 1: ");
                    s1=sc.next();
                    System.out.println("Enter String 2: ");
                    s2=sc.next();
                    if(s1.contains(s2))
                        System.out.println("String 2 is a substring of String 1");
                    else
                        System.out.println("String 2 is not a substring of String 1");

                    break;

//                case 4:
//                    System.out.println("Concated String is : "+string.concat(reverse(string)));
//                    break;
                    
                default: cont =false;
            }
            
        }
    }
    
    static String toggle(String s)
    {
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]>=65 && ch[i]<=90)
                ch[i]=(char)((int)ch[i]+32);
            else if(ch[i]>=97 && ch[i]<=122)
                ch[i]=(char)((int)ch[i]-32);
        }
        return Arrays.toString(ch);
    }
}
