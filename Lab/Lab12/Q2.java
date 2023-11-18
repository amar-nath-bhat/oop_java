package Lab12;

class Generic<T>{
    T obj;
    Generic(T obj){
        this.obj = obj;
        display();
    }

    void display(){
        if(obj instanceof Employee){
            Employee temp = (Employee)obj;
            System.out.println("Name: "+temp.name+" Years: "+temp.years);
        }else{
            Student temp = (Student)obj;
            System.out.println("Name: "+temp.name+" ID: "+temp.ID);
        }
    }
}

class Student{
    String name;
    int ID;
    Student(String name, int ID){
        this.name = name;
        this.ID = ID;
    }
}

class Employee{
    String name;
    int years;
    Employee(String name, int years){
        this.name = name;
        this.years = years;
    }
}


public class Q2 {
    public static void main(String[] args) {
        Generic<Employee> g1 = new Generic<>(new Employee("Mahesh", 5));
        Generic<Student> g2 = new Generic<>(new Student("Suresh", 155));
    }
}
