package day7;

public class Overloading2 {//Create a class with multiple sum methods where one takes two integers, another takes three integers, and another takes two double values. All methods should print the sum of the arguments passed.
void sum(int a, int b){
    System.out.println("the sum of two numbers is "+(a+b));

}
void sum(int a,int b,int c){
    System.out.println(a+b+c);
}
void sum(double a, double b){
    System.out.println(a+b);
}
    
}
class hello{
    public static void main(String[] args) {
        Overloading2 obj=new Overloading2();
        obj.sum(11,10);
        obj.sum(11,9);
        obj.sum(2.5,2.4);
    }
}
