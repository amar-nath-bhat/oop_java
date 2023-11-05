// Write a java program to handle exceptions for the following application.
// Create class banking which has functionalities for deposit and withdrawal. When the withdrawal amount
// exceeds the current balance user defined exception handling routine has to be executed.

import java.util.*;

class NegativeBalanceException extends Exception{
    NegativeBalanceException(String str){
        super(str);
    }
}

class Banking{
    String name;
    double balance;

    Banking(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    void desposit(double amount){
        balance+=amount;
        System.out.println("Rs."+amount+" deposited !!");
        System.out.println("Balance: Rs."+balance);
    }

    void withdraw(double amount) throws NegativeBalanceException{
        if(amount > balance){
            throw new NegativeBalanceException("Amount entered is greater than balance available! Cannot withdraw.");
        }
        else{
            balance-=amount;
            System.out.println("Rs."+amount+" withdrawn !!");
            System.out.println("Balance: Rs."+balance);
        }

    }

}
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter initial balance: ");
        double balance = sc.nextDouble();

        Banking b = new Banking(name, balance);
        while(true){
            System.out.println("Enter choice: 1) Deposit 2)Withdrawal 3)Exit");
            int choice = sc.nextInt();
            double amount = 0.0;
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    b.desposit(amount);
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    try{
                        b.withdraw(amount);
                    }catch(NegativeBalanceException e){
                        System.out.println(e);
                    }
                    break;

                case 3: 
                    return;
                    
                default:
                    break;
            }
        }
    }
}
