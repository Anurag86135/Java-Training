package day10;

public class handling6 {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.length());
        }catch(Exception e)
        {
System.out.println("Exception caught");

        }
        finally{
            System.out.println("Finally block executed");
        }
        System.out.println("hello");
    }
    
}
