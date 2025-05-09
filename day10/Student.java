package day10;
import java.util.Scanner;
// 2. Design a class `Student` with private variables `name` and `marks`. Write methods to set and get
// the values. Also, write a method to print student details
 class details{
    private String Name ;
    private int Marks;

void setValues(String name,int marks){
     Name=name;
     Marks=marks;
    
}
void getValues(){
    System.out.println("your name is "+Name);
    System.out.println("your marks is "+Marks);

}
    
}
public class Student{
    public static void main(String[] args) {
        details obj=new details();
        obj.setValues("Anurag Mishra", 89);
        obj.getValues();
    }
}
