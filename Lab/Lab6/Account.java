package Lab6;
import java.util.Scanner;

class Acct {
    String name, type;
    int acc_no, pin;
    double balance;

    Acct(String name, String type, int acc_no, int pin, double balance) {
        this.name = name;
        this.type = type;
        this.acc_no = acc_no;
        this.pin = pin;
        this.balance = balance;
    }

    void deposit(double amount) {
            balance += amount;
            System.out.println("Rs." + amount + " deposited successfully.");
            dispb();
    }

    void dispb() {
        System.out.println("Balance: " + balance);
    }

    boolean isValid(int pin) {
        return this.pin == pin;
    }

    void withdraw(double amount) {
        if (amount<balance) {
            balance -= amount;
            System.out.println("Rs." + amount + " withdrawn successfully!");
            dispb();
        } else {
            System.out.println("Insufficient Funds");
        }
    }
}

class Savings extends Acct {
    double interest;

    Savings(String name, String type, int acc_no, int pin, double balance) {
        super(name, type, acc_no, pin, balance);
    }

    void computeInterest() {
        interest = 0.2 * balance;
        balance += interest;
        System.out.println("Interest Credited Successfully!!");
        dispb();
    }
}

class Current extends Acct {
    double penalty = 100;
    double minbal = 1000;

    Current(String name, String type, int acc_no, int pin, double balance) {
        super(name, type, acc_no, pin, balance);
    }

    boolean checkPenalty() {
        return balance < minbal;
    }

    void chargePenalty() {
        if (checkPenalty()) {
            balance -= penalty;
            System.out.println("Balance below minimum level, penalty imposed!");
            dispb();
        }
    }
}

public class Account {
    public static void main(String[] args) {
        boolean continueUsing = true;
        Savings[] s = new Savings[100];
        Current[] c = new Current[100];

        s[0] = new Savings("Amarnath B Bhat", "Savings", 123456789, 1234, 12000);
        s[1] = new Savings("Ayush Kumar", "Savings", 234567891, 4455, 5000);
        c[0] = new Current("Mohan Stores", "Current", 334455667, 1100, 121000);
        c[1] = new Current("Laksh Academy", "Current", 110072345, 3390, 333000);

        Acct customer = null; // Initialize to null to handle invalid PIN
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account type: 1) Savings 2) Current: (1/2)?");
        int acc_type = sc.nextInt();
        System.out.println("Enter Your Pin:");
        int acc_pin = sc.nextInt();

        if (acc_type == 1) {
            for (i = 0; i < 2; i++) {
                if (s[i].isValid(acc_pin)) {
                    customer = s[i];
                    break;
                }
            }
        } else if (acc_type == 2) {
            for (i = 0; i < 2; i++) {
                if (c[i].isValid(acc_pin)) {
                    customer = c[i];
                    break;
                }
            }
        }
    
        if (customer != null) {
            while (continueUsing){
            System.out.println("Choose the service you wish: 1) Deposit 2) Withdraw 3) Check Balance"
                    + (acc_type == 1 ? " 4) Interest Deposit Request 5) Exit " : " 4) Exit"));
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the amount you wish to deposit: ");
                    double amountd = sc.nextDouble();
                    customer.deposit(amountd);
                    break;
                case 2:
                    System.out.println("Enter the amount you wish to withdraw: ");
                    double amountw = sc.nextDouble();
                    customer.withdraw(amountw);
                    if(acc_type==2){
                        if(((Current) customer).checkPenalty())
                           ((Current) customer).chargePenalty();
                    }
                    break;
                case 3:
                    customer.dispb();
                    break;
                case 4:
                    if (acc_type == 1) {
                        ((Savings) customer).computeInterest();
                    } 
                    break;
                case 5: continueUsing = false;
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        } System.out.println("Thank you for using our banking services!");
        }
        
        else {
            System.out.println("Invalid PIN or account type!");
        }
    }
}