package day10;

public class ATM {
    private int a;
    void setRupees(int a){
        this.a=a;

    }
    int getRupees(){
        return a;
    }

    
}
class main{
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.setRupees(50001);
        System.out.println(obj.getRupees());
    }
}
