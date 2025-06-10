//package day17;//
import java.util.Date;
import java.util.*;
class Transaction {
    String type ;           //Deposite or withdraw
    double amount;          //Amount of transaction
    Date timestamp ;        //Date and time of Transaction

    public Transaction (String type ,double amount){
        this.type=type;
        this.amount=amount;
        this.timestamp=new Date ();


    }
    public String toString(){
        return type+ " of   Ruppees"+ amount + "on "+timestamp;
    }


}

class Account{
    private String Name;
    private int accountnumber;
    private double balance;
    private ArrayList<Transaction>transaction= new ArrayList<>();

    public Account (String Name , int accountnumber){
        this.Name=Name;
        this.accountnumber=accountnumber;
        this.balance=0.0;
        this.transaction =new ArrayList<>();

        // transactions.add(new Transaction( "Deposit" ,amount));

    }
    public void deposit(double amount){
        if(amount >0){
            balance+=amount;
            transaction.add(new Transaction ("Deposit", amount));
            System.out.println("Deposited rupees "+ amount + "successfully.");
        }else {
            System.out.println("Enter a valid deposit amount. ");
        }
    }
    public void Withdraw(double amount){
        if(amount >0 && amount<=balance){
            balance -= amount;
            transaction.add( new Transaction("Withdraw   rupees",amount));
            System.out.println("Withdraw rupees "+ amount + "succesfully");

        }else{
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void CheckBalance(){
        System.out.println("Current Balance : rupees  "+balance);

    }



    public void showTransactionHistory(){
        if(transaction.isEmpty()){
            System.out.println("No transaction yet.");
        }else{
            System.out.println("Transaction History");
            for(Transaction t: transaction){
                System.out.println(t);
            }
        }
    }
    public int getAccountNumber() {
        return accountnumber;
    }

    public String getName(){
        return Name ;
    }
}


public class Atm{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rand =new Random();
        System.out.println(" welcome to the Simple ATM Banking System!");

        //step 1; Create a new account
        System.out.println("Enter your Name: ");
        String Name =sc.nextLine();
        int aacountNumber =rand.nextInt(100000);//random 5 -digit account number
        Account account =new Account(Name,aacountNumber);

        System.out.println("Account created successfully!");
        System.out.println("Hello "+ Name  +" !YOur Account Number is "+  aacountNumber);

        //step: show menu
        int choice;
        do{
            System.out.println("\n=======ATM MENU =======");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Money");

            System.out.println("4. View Transaction");

            System.out.println("5. Exit");
            System.out.println("Enter your choice (1-5): ");
            choice= sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter amount to deposit : rupees");
                    double depositAmount= sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw : rupees");
                    double withdrawAmount=sc.nextDouble();
                    account.Withdraw(withdrawAmount);
                    break;
                case 3:
                    account.CheckBalance();
                    break;
                case 4:
                    account.showTransactionHistory();
                    break;
                    default:
                    System.out.println("Invalid choice.Please try again");

            }

        }while(choice!=5);

    }
}
