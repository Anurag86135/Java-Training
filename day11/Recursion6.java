package day11;

public class Recursion6 {
    //print x^n(stack heigth =n)

    public static int calPower(int x,int n){
        if(n==0){//base case 1
            return 1;
        }
        if (x==0){//Base case 2
            return 0;}

            int xpowerm1=calPower(x,n-1);
            int xpown=x*xpowerm1;
            return xpown;
            
        }
        public static void main(String[] args) {
            int n=5;
            int x=2;
           int ans= calPower( x, n);
           System.out.println(ans);
        }
}
