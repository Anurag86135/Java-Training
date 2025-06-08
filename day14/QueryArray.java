package day14;
import java.util.Scanner;
//Given Q Queries , check if the given number is present in the array or not.
//note - value of all the elements in the array is less than 10 to the power 5;
public class QueryArray {
    static int [] makeFrequencyArray(int [] arr){
        int []freq =new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }


    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int [] arr =new int[n];
        System.out.println("enter the elements of an array");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }

        int [] freq =makeFrequencyArray(arr);
        System.out.println("enter the number of queries");
        int q=sc.nextInt();

        while(q>0){
            System.out.println("enter number to be searched");
            int x=sc.nextInt();
           
            if(freq[x]>0){
                System.out.println("yess");
            }else{
                System.out.println("No");
            }
            q--;
        }
    }


    
}
