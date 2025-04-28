package day4;

public class method {
     void sum(){
        System.out.println("heloo");
    }

    public static void main(String[] args) {
        method obj=new method();//if not static the function
        obj.multiplication(4);
        obj.sum();
        int subs=obj.sub(5);
        System.out.println(subs);

    }
    void multiplication(int a){
        int b=5;
        int c=a*b;
        System.out.println(c);
    }
    int sub(int a){
        int b=44;
        return b-a;

    }
    
}
