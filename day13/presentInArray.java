package day13;
import java.util.Scanner;
public class presentInArray {
    void Array(){

        System.out.println("enter the number that you want to find");
         Scanner sc =new Scanner (System.in);
        int x=sc.nextInt();
        int ans=-1;
         
        int [] arr ={9,12,22,33,42,9};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
               ans=i;
               break;
        }
    }
    System.out.println(x +"  found at index "+ ans);
}
    public static void main(String[] args) {
       
        presentInArray anurag =new presentInArray();
        anurag.Array();
    }
    

}