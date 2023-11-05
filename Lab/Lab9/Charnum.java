
package Lab9;
import java.util.*;
public class Charnum {
    public static void main(String args[])
    {
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
        
        int c1=0, c2=0, c3=i+1, c4=0;
        // for(int j=0;j <=i;j++)
        //     c1+=s[j].length();
        
        
        // for(int j=0;j <=i;j++){
        //     String words[]=s[j].split(" +");
        //     c2+=words.length;
        // }
        
        // for(int j=0; j<=i; j++){
        //     char ch[];
            
        //     ch=s[j].toLowerCase().toCharArray();
        //     for(int l=0; l< s[j].length(); l++){
        //         if(ch[l]=='a' || ch[l]=='e'||ch[l]=='i'||ch[l]=='o'||ch[l]=='u' )
        //             c4++;
        //     }
        // }
        for(String it : s){
            try{
                c1+=it.length();
            
            String words[] = it.split(" +");
            c2+=words.length;
            char ch[];
            ch = it.toLowerCase().toCharArray();
            for(char c : ch){
                if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u' )
                    c4++;
            }
            }catch(NullPointerException e){
                
            }
        }
        System.out.println(c1+" "+c2+" "+c3+" "+c4);
            
    }
}
