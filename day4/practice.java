package day4;



    import java.util.Scanner;
    
    public class practice {
        public static recursivefactorial(int n){
            if((n==0)||(n==1)){
                return 1;
            }else{
                n*recursivefactorial(n-1);
            }
    
            public static void main(String[] args){
                int n ;
                Scanner sc=new Scanner (System.in);
                System.out.println("Enter the value of number");
                n=sc.nextInt();
                int result=recursivefsctorial(n);
                System.out.println("the facorial of "+ n +" is "+ result);
    
    
            }
        
        
    }
    
    
}
