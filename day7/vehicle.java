package day7;

public class vehicle {
    void run (){
        System.out.println("runn karta hai");
    }
    

    
}
class bike extends vehicle{
    void run(){
        System.out.println("ye bhi chalti hai");
        super.run();//always call in child not in main. 
    }
}

class main{
    public static void main(String[] args) {
        vehicle obj=new bike();
        obj.run();
    }
}

