package day12;

import java.util.HashSet;
import java.util.LinkedList;

public class lin2 {
    public static void main(String[] args) {
    //     LinkedList<Integer> arr =new LinkedList<>();
    //     for(int i=0;i<=999;i++){
    //         if(i>=100 && i<=200){
    //        arr.add(i);
          
    //     }
       
    // }
    //  System.out.println(arr);
    // if we want to remove duplicate array so we use HashSet

    int [] arr={1,2,3,4,4,5,6,6,7,};
    HashSet<Integer>set =new HashSet<>();
    for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
    }
    System.out.println(set);
}
}
