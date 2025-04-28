package day4;

public class variable {
    int a=5;//non static variabe
    static int b=5;//static variable
    public static void main(String[] args){
        int c =5;//local variable
        variable obj=new variable();
        System.out.println(obj.a);
        System.out.println(b);
        System.out.println(c);
    }
    
}
