package day3;

import java.util.Scanner;


public class digitEven {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int digit = scanner.nextInt();
        scanner.close();
        int sum =0;

        // String numberStr = String.valueOf(number);

        // for (int i = 0; i < numberStr.length(); i++) {
        //     int digit = Character.getNumericValue(numberStr.charAt(i));
        //     if (digit % 2 == 0) {
        //         System.out.println("Digit " + digit + " is even.");
        //     } else {
        //         System.out.println("Digit " + digit + " is odd.");
        //  
        while(sum>0){
           int digit =sum%10;
           if(digit%2==0){
            System.out.println(digit+ " is even");
           }
           else{
            System.out.println(digit+ " is odd");
           }
           
           sum=sum/10;
        }   }
        }
    

    

