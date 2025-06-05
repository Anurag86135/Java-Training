package day13;
import java.util.Scanner;
//find the total number of pairs int the Array whose sum is equal to the given value
public class NumberSumpairInArray {
    static int pairsum(int[] arr , int target){
        int n=arr.length;
        int ans =0;

        for(int i=0;i<n; i++){//first number
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }

        }
        return ans ;

    
}

public static void main (String [] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int [] arr =new int [n];

    System.out.println("Enter the " + n +" elements of the array");
    for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();  
  }
  System.out.println("Enter the target sum");
  int target =sc.nextInt();


  System.out.println(pairsum(arr,target));

}
}

