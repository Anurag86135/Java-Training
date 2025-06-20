package day14;
import java.util.Scanner;
public class WithoutSpaceRotateByK {
 
static void swap(int arr[],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

    static void reverse(int [] arr, int i, int j){
    //     int i=0;
    //    int  j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            
            i++;
            j--;
        }
    }

    static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+",");

    }   System.out.println();
 }


    static void rotateInPlace(int [] arr,int k){
        int n= arr.length;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        
        
    }

    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the length of an array");
        int n=sc.nextInt();
        int[] arr=new int [n];

        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
    System.out.println("Enter the value of k");
    int k=sc.nextInt();

    System.out.println("Original Array");
    printArray (arr);

    rotateInPlace(arr ,k);


    System.out.println("array after rotation");
    printArray(arr);





    }
    
}
