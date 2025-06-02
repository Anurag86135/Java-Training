package day12;

import java.util.LinkedList;

public class linklist {
    public static void main(String[] args) {
        LinkedList<Integer> arr =new LinkedList<>();
        arr.add(4);
        // System.out.println(4);
        arr.add(2);
        arr.add(1,3);
        arr.removeLast();
        System.out.println(arr);

    }
    
}
