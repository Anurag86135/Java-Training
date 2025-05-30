package day11;
// print x^n(stack height =logn)
public class Recursion7 {
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //if(n is even)
        if (n%2==0){
            return calPower(x,n/2)*calPower(x,n/2);

        }
        else{//n is odd
            return calPower(x,n/2)* calPower(x,n/2)*x;
    }
}

    public static void main (String[] args){
        int n=5,x=2;
        int ans=calPower(x,n);
        System.out.println(ans);
    }

    
    
}
