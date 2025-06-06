package day15;

public class CountEven {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,5,4,4,3,8};
        int count=0;
        int sout=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               count++;

            }
            if(arr[i]%2!=0){
                sout++;

            }
           
        }
        System.out.println(count);//counting even
        System.out.println(sout);//counting odd
        
        

    }
    
}
