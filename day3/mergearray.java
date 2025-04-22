package day3;

public class mergearray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int [] arr1={1,2,4,5};
        int [] merge =new int[arr.length+arr1.length];
        for(int i=0;i<arr.length;i++){
            merge[i]=arr[i];
        }
        for(int j=0;j<arr1.length;j++){
            merge[arr.length+j]=arr1[j];
        }
        System.out.print("{");
        for(int i=0;i<merge.length;i++){
        System.out.print(merge[i]+ " ");

        }
        System.out.print("}");
    }
    
}
