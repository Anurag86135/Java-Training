package day3;

public class maxTwoDArray {
    public static void main(String[] args){
        int array[][] ={{1,2,3},
                        {4,5,6},
                        {7,8,9}

        };
        int max=array[0][0];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]>max){
                    max=array[i][j];

                }
            }
        }
        System.out.println("the maximum element of the  given array is "  +max);

    }
    
}
