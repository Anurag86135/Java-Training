package day11;
//print the fibonacci sequence till nth term*

public class Recursion5 {
    public static void prinFib(int a,int b,int n){
        if(n==0){
            return;
        }


        int c=a+b;
        System.out.println(c);
        prinFib(b,c,n-1);
    }

    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        prinFib(a,b,n-2);
    }
    
}
