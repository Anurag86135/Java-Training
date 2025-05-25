package day10;

public class KidansAlgorithm {
    public static void main(String[] args) {
        //Example array
        int [] arr= {-2,1,-3,4,-1,2,1,-5,4};

        //call the function to find max subarray sum
        int maxsum=kadane(arr);
        
        //print the result
        System.out.println("Maximum subarray sum is :" + maxsum);
    }

    public static int kadane(int[] arr){

        //Initiailze currentsum and maxsofar with the first element of the array
        int currentSum=arr[0];
        int maxsoFar =arr[0];

        //loop of the array starting from the Second elemnt 
        for(int i=1;i<arr.length;i++){
            //Decide whether to add the current element to the existing sum
            //or start fresh from the current element 
            currentSum =Math.max(arr[i],currentSum+arr[i]);
        

        //update maxsofar if current is greater 
        maxsoFar =Math.max(maxsoFar, currentSum);

        }

        //Return the maximum sum found
        return maxsoFar;
    }
}
    
    

