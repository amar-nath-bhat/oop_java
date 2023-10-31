// Write a program to define a matrix class. Create 5 threads – t1 displaying elements in
// a matrix form, t2- display the transpose of the matrix, t3-display maximum value
// in the matrix, t4-to display principal diagonal elements, t5-display non diagonal
// elements [ Hint : Multiple instances of thread]

package Lab11;

import java.util.Scanner;

class Matrix {
    private Scanner sc = new Scanner(System.in);
    private int m, n;
    private int arr[][];

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        arr = new int[m][n];
    }
    
    public void readMatrix() {
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
    }

    public void displayMatrix() {
        System.out.println("Matrix elements are:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void displayTranspose() {
        System.out.println("Transpose:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void displayMax() {
        int max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max element in matrix is: " + max);
        System.out.println("");
    }

    public void displayPrincipalDiagonal() {
        System.out.println("Principal Diagonal:");
        for (int i = 0; i < Math.min(m, n); i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println("");
        System.out.println("");
    }

    public void displayNonDiagonal() {
        System.out.println("Non-Diagonal Elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println("");
        System.out.println("");
    }
}

class MyThread extends Thread {
    private int operation;
    private Matrix matrix;

    public MyThread(int operation, Matrix matrix) {
    this.operation = operation;
    this.matrix = matrix;
}


    public void run() {
        switch (operation) {
            case 1:
                matrix.displayMatrix();
                break;
            case 2:
                matrix.displayTranspose();
                break;
            case 3:
                matrix.displayMax();
                break;
            case 4:
                matrix.displayPrincipalDiagonal();
                break;
            case 5:
                matrix.displayNonDiagonal();
                break;
            default:
                break;
        }
        
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the matrix:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        Matrix matrix = new Matrix(rows, cols);
        matrix.readMatrix();

        MyThread t1 = new MyThread(1, matrix);
        MyThread t2 = new MyThread(2, matrix);
        MyThread t3 = new MyThread(3, matrix);
        MyThread t4 = new MyThread(4, matrix);
        MyThread t5 = new MyThread(5, matrix);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
