package Lab12;

import java.util.ArrayList;

class Student1{
    String name;
    int ID, marks;

    Student1(String name, int ID, int marks) {
        this.name = name;
        this.ID = ID;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + " ID: " + ID + " Marks: " + marks);
    }
}

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Student1> a = new ArrayList<>();
        a.add(new Student1("Animesh", 34, 78));
        a.add(new Student1("Sankalp", 23, 85)); 
        a.add(new Student1("Mahesh", 11, 99));

        for (Student1 s : a) {
            if (s.marks > 80)
                s.display();
        }
    }
}
