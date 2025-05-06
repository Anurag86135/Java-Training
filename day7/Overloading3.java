package day7;

public class Overloading3 {
    
    void Student(){
        System.out.println(this);
        
    }
public static void main(String[] args){
    Overloading3 obj =new Overloading3();
    obj.Student();
    System.out.println(obj);
}
    


    
}
