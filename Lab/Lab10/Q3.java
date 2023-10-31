
package Lab10;

import java.util.Scanner;

public class Q3 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name, roll, m1, m2, m3;
        float percent=0;
        
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter roll no: ");
        roll = sc.nextLine();
        System.out.println("Enter marks 1: ");
        m1 = sc.nextLine();
        System.out.println("Enter marks 2: ");
        m2 = sc.nextLine();
        System.out.println("Enter marks 3: ");
        m3 = sc.nextLine();
        
        try{
            int marks1, marks2, marks3;
            marks1 = Integer.parseInt(m1);
            marks2 = Integer.parseInt(m2);
            marks3 = Integer.parseInt(m3);
            percent = (marks1+marks2+marks3)/3;
            
        }catch(Exception e){
            System.out.println("" +e);
        }
        System.out.println("Percent: " + percent + " Grade: " + grade(percent));
    }
     
    static char grade(float percent){
        if(percent >= 90 && percent <= 100)
            return 'A';
        else if(percent >= 80 && percent < 90)
            return 'B';
        else if(percent >= 70 && percent < 90)
            return 'C';
        else if(percent >= 60 && percent < 70)
            return 'D';
        else if(percent >= 50 && percent < 60)
            return 'E';
        else if(percent >= 0 && percent < 50)
            return 'F';
        else
            return 'I';
    }
}
