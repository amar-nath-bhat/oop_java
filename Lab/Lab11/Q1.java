// Write a menu driven program to create thread using runnable interface and inheriting
// thread class.[ Hint : Make use of Extends and Implements keywords]
package Lab11;

import java.util.Scanner;

class MyThreadClass extends Thread {
    public void run() {
        System.out.println("This is Thread Class!");
    }
}

class MyRunnableClass implements Runnable {
    public void run() {
        System.out.println("This is Runnable Interface!");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Enter option: 1) Thread Class 2) Runnable Interface 3) Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    MyThreadClass t = new MyThreadClass();
                    t.start();
                    break;

                case 2:
                    MyRunnableClass t1 = new MyRunnableClass();
                    Thread t1_load = new Thread(t1);
                    t1_load.start();
                    break;

                case 3:
                    return; // Exit the program

                default:
                    System.out.println("Invalid option. Please enter a valid option.");
            }
        }
    }
}
