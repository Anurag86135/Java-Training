package day4;

public class bubble {
    int temp=0;
    static void BubbleShort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    
                    temp=arr[j];
                    arr[j+1]=arr[j];
                    arr[j+1]=temp;

                    
                }
            }
        }
        for(int i:arr){
            
        }
    }
    
}
