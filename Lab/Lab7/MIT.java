/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

class MIT{
    
    static class Student_Details{
        String name, college_name;
        int id;
        Student_Details(String name, int id, String college_name){
        this.name=name;
        this.id=id;
        this.college_name=college_name;
        }
        void display(){
            System.out.println("Student Name: "+name);
            System.out.println("Student ID: "+id);
            System.out.println("College Name: "+college_name);
        }
    }   
    
    public static void main(String args[]){
        Student_Details s[] = new Student_Details[100];
        s[0]= new Student_Details("Amar", 12345, "MIT");
        s[1]= new Student_Details("Dhanush", 12346, "MIT");
        s[2]= new Student_Details("Nidheesh", 12347, "MIT");
        s[3]= new Student_Details("Shrishanth", 12348, "MIT");
        
        for(int i=0; i<4;i++){
            s[i].display();
            System.out.println("");
        }
    }
}
