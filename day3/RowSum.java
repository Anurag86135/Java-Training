package day3;

public class RowSum {
    public static void main(String[] args) {
        int[][] array={{1,2,3},
                       {4,5,6},
                       {7,8,9}
    };
        for(int i=0;i<array.length;i++){
            int RowSum=0;
            for(int j=0;j<array[i].length;j++){
                RowSum +=array[i][j];

            }
            System.out.println("Sum of Row " + i + ":" + RowSum);
        }
        
    }
    
}
