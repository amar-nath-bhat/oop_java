// Oops question-
// Create an interface which has two methods void search () and void display() 
// the Student1 and Book classes implement the interface. Use two threads to take the input details of Student1s(name, regno) and Books (name, Id no)
// The search method should search for a particular Student1 based on regno and a book based on id no
// If the Student1/ book is not found then throw an exception saying that Details Not Found. Use the concept of generics for the details

package Practice;

import java.util.Scanner;

interface prg{
    void search(int i);
    <T> void display();
    void read();
}

class DetailsNotFoundException extends Exception{
    DetailsNotFoundException(String str){
        super(str);
    }
}

class Student1 implements prg{
    Scanner sc = new Scanner(System.in);
    String name;
    int reg;

    public void read(){
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter Reg No: ");
        reg = sc.nextInt();
    }
    
    public void search(int reg){
        if(this.reg == reg)
            display();
    }

    public <T> void display (){
        System.out.println("Name: "+name+" RegNo: "+reg);
    }
}

class Book implements prg{
    Scanner sc = new Scanner(System.in);
    String name;
    int id;

    public void read(){
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter ID: ");
        id = sc.nextInt();
    }

    public void search(int id){
        if(this.id == id)
            display();
    }

    public <T> void display(){
        System.out.println("Name: "+name+" ID: "+id);
    }
}

class MyThread extends Thread{
    Scanner sc = new Scanner(System.in);
    Student1 s[];
    Book b[];
    int n, option;

    MyThread(int n, int option){
        this.n = n;
        this.option = option;
    }

    public void run(){
        switch (option) {
            case 1:
                s = new Student1[n];
                for(int j=0; j<n; j++){
                    s[j] = new Student1();
                    s[j].read();
                }
                break;
            
            case 2:
                b = new Book[n];
                for(int j=0; j<n; j++){
                    b[j] = new Book();
                    b[j].read();
                }
                break;
        
            default:
                break;
        }
    }

    Student1[] getArray(Student1 s[]){
        return this.s;
    }

    Book[] getArray(Book b[]){
        return this.b;
    }
}
public class prg10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=0, n=0;
        System.out.println("Enter no. of Students and Books: ");
        m = sc.nextInt();
        n = sc.nextInt();
        Student1 s[] = new Student1[m];
        Book b[] = new Book[n];

        MyThread t1 = new MyThread(m, 1);
        MyThread t2 = new MyThread(n, 2);
        t1.start();
        try{
            t1.join();
        }catch(Exception e){}
        s = t1.getArray(s);

        t2.start();
        try{
            t2.join();
        }catch(Exception e){}
        b = t2.getArray(b);

        System.out.println("Enter RegNo of student you want to search: ");
        int search1 = sc.nextInt();

        System.out.println("Enter ID of book you want to search: ");
        int search2 = sc.nextInt();

        for(int i=0; i<m; i++)
            s[i].search(search1);

        for(int i=0; i<n; i++)
            b[i].search(search2);

    }
}
