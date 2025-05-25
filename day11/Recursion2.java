package day11;

public class Recursion2 {//print numbers from 1 to 5 from recursion
    public static void printNum(int n){
        if(n==6){
            return;
        }

        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String [] args){
        int n=1;
        printNum(n);
    }
    
}
