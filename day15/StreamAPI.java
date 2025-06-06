package day15;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamAPI {
public static void main(String[] args) {
    ArrayList<Integer>list =new ArrayList<>();
    list.add(1);
    list.add(4);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(44);

    ArrayList<Integer>Data =(ArrayList<Integer>) list.stream().map(a->a*4).collect(Collectors.toList());
    // ArrayList<Integer>Data =(ArrayList<Integer> ) list.stream().filter(a->a>2).collect(Collectors.toList());
    // System.out.println(Data);
    System.out.println(Data);

}    
}
