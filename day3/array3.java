package day3;

import java.util.Scanner;
public class array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int max=arr[0];
        for(int i=1;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Mamximum element in the array is :" + max);

        
    }
    
}
