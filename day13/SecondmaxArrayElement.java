package day13;
import java.util.Scanner;

public class SecondmaxArrayElement {
    public static int Maximum(int [] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
            max=arr[i];

            }

        }
        return max;
    }
        public static int second(int[]arr ){
            int max=Maximum(arr);//
             max =Maximum(arr);
             int n=arr.length;
            for(int i=0;i<n;i++){
                if(arr[i]==max){
                    arr[i]=Integer.MIN_VALUE;
                }
            }
        
        int SecondMax=Maximum(arr);
        return SecondMax;
    }
    public static void main(String [] args){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the element of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the second max element is " + second(arr));
    }
    
}
