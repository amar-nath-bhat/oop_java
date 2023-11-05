/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;
import java.util.*;
public class wordreplace {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String string;
        System.out.println("Enter the string: ");
        string= sc.nextLine();
        String res="";
        char ch[]=string.toCharArray();
        for(int i=0;i<string.length();i++){
            for(int j=0;j<string.length();j++){
                if(i==j)
                    continue;
                else{
                    if(ch[i]==ch[j]){
                        res+=ch[i];
                    }
                        
                }
            }
        }
        System.out.print(res);
        
        
    }
}
