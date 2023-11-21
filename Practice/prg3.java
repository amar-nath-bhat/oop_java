package Practice;

import java.util.Scanner;

public class prg3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        int n;

        System.out.println("Enter value of x: ");
        x = sc.nextDouble();

        System.out.println("Enter value of n (no. of terms): ");
        n = sc.nextInt();

        double sum = 0;
        for(int i=1, j=1; i<=n; i++, j+=2){
            double term = Math.pow(-1, i-1) * Math.pow(x, j) / (fact(j));
            System.out.println(term);
            sum += term;
        }

        System.out.println(sum);
        sc.close();
    }

    public static double fact(double n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
}