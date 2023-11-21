
// Develop a program for searching a student from a class. Assume a set of 10 students
// with their details as Registration number, First Name, Last Name and Degree in an
// array of Student objects. Search a student either by First Name or Last Name.

package Practice;

class Student {
    String fname, lname, degree;
    int reg;

    Student(String fname, String lname, String degree, int reg){
        this.fname = fname;
        this.lname = lname;
        this.degree = degree;
        this.reg = reg;
    }

    void search(String name){
        if(name.equalsIgnoreCase(fname) || name.equalsIgnoreCase(lname)){
            disp();
        }
    }

    void disp(){
        System.out.println("Name: "+fname+" "+lname+" RegNo: "+reg+" Degree: "+degree);
    }
}
public class prg6 {
    public static void main(String[] args) {
        Student s[] = { new Student("Amar", "Bhat", "CCE", 123),
                        new Student("Abdul", "Khan", "IT", 134),
                        new Student("Mahesh", "Choudhary", "CSE", 112),
                        new Student("Mahira", "Singh", "DSE", 146),
                        new Student("Satvik", "Acharya", "IT", 135),
                        new Student("Satvik", "Choudhary", "IT", 138)
        };

        String name = "Choudhary";
        for(int i=0; i<6; i++){
            s[i].search(name);
        }
    }
}
