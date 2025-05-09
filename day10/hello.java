package day10;
import java.util.Scanner;
// Create a class `BankAccount` with a private balance variable. Write getter and setter methods to
// deposit and withdraw money

public class hello{
    public static void main(String[] args) {
        BanckAccount obj=new BanckAccount();
        obj.deposit(500);
        
        System.out.println(obj.withdraw());
        obj.deposit(1000);
        System.out.println(obj.withdraw());
        
    }
}
 class BanckAccount {
    private int balance ;
    void deposit(int balance){
        this.balance +=balance;
    }
    int withdraw(){
        int result=0;
        System.out.println("enter the amount that you want to withdraw");
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        balance=balance-w;
        
        return balance;



    }
}