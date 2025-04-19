package day3;

public class Array6 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={2,3,4,5};
        int [] sum =new int [arr2.length];
        for(int i=0;i<arr1.length;i++){
            sum[i]=arr1[i]+arr2[i];
        }
        System.out.print("{");
        for(int i=0;i<4;i++){
            System.out.print(  sum[i] + " , ");
            System.out.print("}");
        }

    }
    
}
