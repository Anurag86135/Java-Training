package day13;
import java.util.Scanner;
// count the number of truplets whose sum is equal to the given value x


public class TrippleSum {
    public static int hello(int[] arr, int target){
        int n=arr.length;
        int ans=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target) ans++;
                }
            }
        }
        return ans;
        
    }
    public static void main(String [] args){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the Elements of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        System.out.println("enter the value of target sum");
        int target=sc.nextInt();

        System.out.println(hello(arr,target));


    }

    
}
