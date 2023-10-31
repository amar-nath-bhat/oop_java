// Create a main class called bank with acc_no,owner_name,balance
// It should have 3 branches with branch_id ,location
// Create functions
// 1) using constructors initialise all these such that  branch_id of 2nd and 3rd are incremented when user enters branch_id1
// 2) a function which accepts deposit from the user to a branch required and displays the updated balance and display all details
// [3) a function to transfer account from branch to main . The user enters an acc_no check if for redundancy in main bank if found update everything and display

package Practice;

import java.util.Scanner;

class Bank{
    long acc_no;
    String owner_name;
    double balance;
    int branch_id=100;
    String location="Delhi";
}

class Branch1{
    int branch_id=101;
    String location="Mysore";
}

class Branch2{
    int branch_id=102;
    String location="Bengaluru";
}

class Branch3{
    int branch_id=103;
    String location="Udupi";
}

class prg1{
    public static void main(String[] args) {
        Bank acct;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the branch ID: ");
        int id = sc.nextInt();
        
            

    }
}