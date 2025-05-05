package day6;

import java.util.Scanner;
public class functions2 {
    //11.	WAP to find all factors of a given number
    static void factorNumber(){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        int number =sc.nextInt();
       System.out.println(" the factor of the given number "+number +"is:");
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println(i+ " ");
            }
        }
    }

    //12.	WAP to find sum of all factors of a given number
     static int SumFactor(int number){
        int sum =0;
        System.out.println("the factors of the given number " +number+"is :");
        for(int i=1;i<=number;i++){
            
            if(number%i==0){
                 sum =sum+ i;

            }
            
        }
        return (sum);
       // System.out.println("the sum of factorial of the number "+number+" is:"+sum);
                
                
    }

    // 13.	WAP to count all the factors of a given number and display it
    static void CountFactor(int number ){
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
                System.out.println(i+ " ");
        }
            }
            
        
        System.out.println("the count of the factorialof the given number "+number+" is "+count);
    }

    // 14.	WAP to check a number is prime or not
    static void PrimeORnot(int number){
        
    }
    static void isprime number
    public static void main(String[] args){
       // Scanner sc =new Scanner (System.in);
        //factorNumber();
    //    (int number= 10;
    //    int result=SumFactor(number);
    //    System.out.println("the sum of factorial of  the number " +number+ " is :"+result);)
      CountFactor(20);
        
    }
    
}
