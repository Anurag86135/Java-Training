package day3;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {//jvm call karta hai is main method ko
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n =sc.nextInt();
        int arr[] =new int[n];
        int sum =0;

        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           // sum+=arr[i];
        }
       //System.out.println("sum = "+ sum);
       for(int i=0;i<arr.length;i++){
    
        System.out.println(arr[i] );
        
       }
       
    }
    
    
}
