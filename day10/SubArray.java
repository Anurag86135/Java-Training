//import java.util.Scanner
package day10;

public class SubArray{
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        //int[] arr=sc.nextInt();
int [] arr={9,8,6,7,5,4}   ;
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length-1;j++){
        if(arr[i]<arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        // System.out.println(arr[i]);


    }
    
}
System.out.println("the sorted array");
for(int i=0;i<=arr.length;i++){
    System.out.println(arr[i]);
}


}
}