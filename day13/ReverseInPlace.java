package day13;
import java.util.Scanner;

public class ReverseInPlace {
    public static void swapArray(int[] arr, int i, int j){
        

       
            arr[i] =arr[i]+arr[j];
            arr[j] =arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];

            
        
        


    }

    static void reverse(int [] arr){
        int i=0;int j=arr.length-1;
        // int n=arr.length;
        // int ans[]=new int [n];//
        while(j>i){
        swapArray(arr ,i, j);

            i++;
            j--;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();

        System.out.println("enter the elements of array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();

        }
        reverse(arr);

        printArray(arr);
        

        
    }

    
}
