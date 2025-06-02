package day13;

public class MaxArray {
    void MAxArr(){
        int [] arr={377,6,7,8,77,66,87};
          int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        

        }
        System.out.println("Maximum:  "+ ans);
    }
    public static void main(String[] args) {
        MaxArray anurag=new MaxArray();
        anurag.MAxArr();
    }
    
}
