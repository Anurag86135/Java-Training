package day16;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
// Given a list of integers, return a list of squares of only even numbers.
public class practic2 {
    public static List<Integer>squareEvenNumber(List<Integer>numbers){
        return numbers.stream().filter(n -> n %2 ==0).map(n ->n*n).collect(Collectors.toList());
       
    }
public static void main(String[] args) {
    List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
    List<Integer> result =squareEvenNumber(numbers);
    System.out.println(result);
}
    
}
