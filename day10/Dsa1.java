package day10;

public class Dsa1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int LastValue =arr[arr.length-1];

        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
            
        }arr[0]=LastValue;
        for(int k:arr){
            System.out.println(k);
        }
    }
    
}
