package day12;
import java.util.HashSet;
public class Hash_Set {
    public static void main(String[] args) {
        int[] arr={1,2,20,2,3,4,5,6,6,7};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
                break;
            }
            else{
                set.add(arr[i]);
            }
        }System.out.println(set);
    }
    
}
