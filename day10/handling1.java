package day10;

class handling1{
public static void main(String[] args) {
    int a=10,b=0;

   
    try {int c=a/b;
        System.out.println(c);
        
    } catch (Exception e) {
        System.out.println(e);
        System.out.println("Zero is not divisible with any number");
    }
    System.out.println("hello");
    System.out.println("hiii");
}
}