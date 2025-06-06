package day15;

import java.util.ArrayList;

public class Reduce {
    public static void main(String[] args) {
    ArrayList<Integer>list =new ArrayList<>();
    list.add(1);
    list.add(4);
    list.add(6);
    list.add(8);
    list.add(9);
    // int sum = list.stream().reduce(0,(a,b)->a+b);
    // System.out.println(sum);//

    // int min=list.stream().reduce(0,(a,b)->a<b?a:b);//minnimum number
    // System.out.println(min);

int max =list.stream().reduce(0,(a,b)->a>b? a:b);
System.out.println(max);
    
    
}
}
