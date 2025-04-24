package day3;

public class TwoDArray {
    public static void main(String[] args) {
        int sum=0;
    
    int[][] array={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    //row
  
    for(int i=0;i<array.length;i++){
        //columns
        for(int j=0;j<array[i].length;j++){
            sum +=array[i][j];
            //System.out.print("sum " + sum);
        }
        //System.out.println();
    }
    System.out.println("Total sum "+ sum);
    }
    
}
