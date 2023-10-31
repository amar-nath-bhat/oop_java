// package Assignment;
import java.util.*;

class NegativeMarkException extends Exception{
    NegativeMarkException(String str){
        super(str);
    }
}

class MarkOutofRangeException extends Exception{
    MarkOutofRangeException(String str){
        super(str);
    }
}

interface Mark{
    void dispMark();
}

class Student implements Mark, Comparable<Student>{
    Scanner sc = new Scanner(System.in);
    
    static int count;
    static Object store [][] = new Object[10][10];
    String name, category;
    int regNo;
    double marks1, marks2, marks3, avg;
    char grade;

    public Student(String name, String category, int regNo){
        this.name = name;
        this.category = category;
        this.regNo = regNo;
    }

    void input() throws MarkOutofRangeException, NegativeMarkException{
        System.out.println("Enter marks in Subject 1: ");
        marks1 = sc.nextDouble();
        System.out.println("Enter marks in Subject 2: ");
        marks2 = sc.nextDouble();
        System.out.println("Enter marks in Subject 3: ");
        marks3 = sc.nextDouble();

        if(marks1<0 || marks2<0 || marks3<0)
            throw new NegativeMarkException("Negative Marks Entered! ");
        if(marks1>100 || marks2>100 || marks3>100)
            throw new MarkOutofRangeException("Marks not in range 0-100");

        avg = (marks1 + marks2 + marks3)/3.0;
        gradeCalc(avg);
        addToMatrix();
    }

    void gradeCalc(double percent){
        if(percent >= 90 && percent <= 100)
            grade = 'A';
        else if(percent >= 80 && percent < 90)
            grade = 'B';
        else if(percent >= 70 && percent < 90)
            grade = 'C';
        else if(percent >= 60 && percent < 70)
            grade = 'D';
        else if(percent >= 50 && percent < 60)
            grade = 'E';
        else if(percent >= 0 && percent < 50)
            grade = 'F';
    }

    void addToMatrix(){
        store[count][0] = this.avg;
        store[count][1] = this.regNo;
        store[count][2] = this.grade;
        count++;
    }

    @Override
    public void dispMark(){
        System.out.println("Name: "+name);
        System.out.println("Reg No: "+regNo);
        System.out.println("Course: "+category);
        System.out.println("Average Marks: "+avg);
        System.out.println("Grade: "+grade);
    }

    @Override
    public int compareTo(Student s1)
    {
        if(this.avg>s1.avg)
            return -1;
        if(this.avg<s1.avg)
            return 1;
        return 0;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int num = sc.nextInt();
        sc.nextLine();
        String name, category;
        int regNo;

        Student s[] = new Student[num];
        for(int i=0; i<num; i++){
            System.out.println("Name: ");
            name = sc.nextLine();
            System.out.println("Reg No: ");
            regNo = sc.nextInt();
            System.out.println("Course: UG/PG");
            category = sc.next();
            s[i] = new Student(name, category, regNo);
            try{
                s[i].input();
            }catch(NegativeMarkException | MarkOutofRangeException e){
                System.out.println("Exception occured: "+e);
            }
        }
        Arrays.sort(s);
        System.out.println("Top 3 Students: ");
        s[0].dispMark();
        s[1].dispMark();
        s[2].dispMark();
        sc.close();

    }
}
