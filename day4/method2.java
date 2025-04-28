package day4;

import java.util.Scanner;





public class method2 {
    static void sum(int n){
        
        for(int i=1;i<n;i++){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        
        sum(n);
        
    }
    
}

