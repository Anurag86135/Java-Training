package day3;

public class reverseNumber {
    public static void main(String[] args) {
        int num =12346789;
        int original = num;
        int reverse=0;
        System.out.println("original number is "+original);

        while(num>0){
            int digit =num%10;
            reverse =reverse*10+digit;
            num=num/10;
        }
        System.out.println(reverse);
    }
    
}
