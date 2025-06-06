package day14;
import java.util.Scanner;
public class RotateByKPosition {
 static int[] rotateByk (int []arr,int k){
        int n=arr.length;
        k= k%n;
        int  []ans =new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        

    return ans;

}
 static void printArray(int [] arr){
    System.out.println("the array is given below");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ ",");
    }
    System.out.println();
}
public static void main(String [] args){
    Scanner sc =new Scanner (System.in);
    System.out.println("Enter the length of an array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements of an array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
    // System.out.println();//?
    System.out.println("Original array");
    printArray(arr);
    System.out.println("Enter the value of k");
    int k=sc.nextInt();
    // int k;//
    int [] ans=rotateByk(arr,k);
    System.out.println("Array after rotatation");
    printArray(ans);



}
    
}
