package day3;

public class minTwoDArray {
    public static void main(String[] args) {
        int arr[][]={
            {55,20,30},
            {4,5,6},
            {8,9,7}
        };
        int min =arr[0][0];
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }

            }
        }
        System.out.println("the minimum element in the given array "+min);
    }
    
}
