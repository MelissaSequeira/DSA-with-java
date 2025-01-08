package PROBLEM_TO_PRACTICE;

import java.util.*;
class BankAccount{
    String acNo;
    double bln;
     BankAccount(String accNumber,double balance){
        this.acNo=accNumber;
        this.bln=balance;
    }
    double deposit(double amount){
        double newBalanced= this.bln + amount;
        return newBalanced;
    }
    double withdraw(double amount){
        double newBalancew= this.bln - amount;
        return newBalancew;
    }

}

public class Prob21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter account number and balance and amount:");
        String accno=sc.next();
        double bal=sc.nextInt();
        double acc=sc.nextInt();
        BankAccount ba= new BankAccount(accno,bal);
        double depositedBalance = ba.deposit(acc);
        double withdrawnBalance=ba.withdraw(acc);
        System.out.println("Balance after depositing:"+depositedBalance);
        System.out.println("Balance after withdrawing:"+withdrawnBalance);
    }    
}
