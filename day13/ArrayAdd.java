package day13;

//package day13;

public class ArrayAdd {
    void ArrAdd(){
        int arr[] ={1,2,3,4};
        int sum=0;

        for (int i=0;i<arr.length;i++){
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        ArrayAdd obj=new ArrayAdd();
        obj.ArrAdd();

    }



}
