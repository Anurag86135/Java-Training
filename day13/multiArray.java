package day13;

public class multiArray {
    void multidimenArray(){
        // int [][] arr_1=new int [5][3];//alternate way
        int [][] arr ={{56,43,6},{34,7,8},{12,56,8}};

        
        System.out.println(arr[0][0]);//56
        System.out.println(arr[1][0]);//34
        System.out.println(arr[2][0]);//12

    }
    public static void main(String[] args){
        multiArray obj =new multiArray();
        obj.multidimenArray();
    }
    
}
