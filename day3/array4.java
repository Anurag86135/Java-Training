package day3;

import java.util.Scanner;
public class array4 {
    //Array ke ander kitne odd or even numbers hain , uska count nikalo;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int even = 0, odd =0;

        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

            //for showing array
            
            for(int i=0;i<n;i++){
               
               // System.out.println("the array is given as according to you4r inputs " + arr[i]);
            if (arr[i]%2==0){
           System.out.println(arr[i] +":"+ "even");// even++;
            }
            else{
            //odd++;sout    
            System.out.println(arr[i] + ":" + "odd");
            }
           // System.out.println("Even "+ even + " , odd = "+ odd);


        }


        
    
    
}
    }
