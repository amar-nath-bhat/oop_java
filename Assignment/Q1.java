import java.util.Arrays;

class Employee implements Comparable<Employee> {
    private String name;
    private int YoE; 

    public Employee(String name, int YoE) {
        this.name = name;
        this.YoE = YoE;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return this.YoE - otherEmployee.YoE;
    }

    @Override
    public String toString() {
        return "Name=" + name + ", YoE=" + YoE + "]";
    }
}

class Student implements Comparable<Student> {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.grade.compareTo(otherStudent.grade);
    }

    @Override
    public String toString() {
        return "[Name=" + name + ", grade=" + grade + "]";
    }
}

class SortUtility<T> {
    private T[] array;

    public SortUtility(T[] array) {
        this.array = array;
    }

    public void sort() {
        Arrays.sort(array);
    }

    public void display() {
        for (T item : array) {
            System.out.println(item);
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("John", 5),
            new Employee("Alice", 3),
            new Employee("Bob", 17)
        };

        Student[] students = {
            new Student("Emily", "A"),
            new Student("David", "B"),
            new Student("Ella", "C")
        };

        SortUtility<Employee> employeeSorter = new SortUtility<>(employees);
        SortUtility<Student> studentSorter = new SortUtility<>(students);

        System.out.println("Sorting Employees:");
        employeeSorter.sort();
        employeeSorter.display();

        System.out.println("\nSorting Students:");
        studentSorter.sort();
        studentSorter.display();
    }
}
