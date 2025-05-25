package day11;
//print factorial of a number n

public class Recursion4 {
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }

       // int fact_nm1=fact(n-1);
        int fact_n=n*fact(n-1);
        return fact_n;
    }

    public static void main(String[] args) {
        int factorial=fact(5);
        System.out.println(factorial);
    }
    
}
