package day12;

class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
        try{
            Thread.sleep(4000); //it will stop accordingto time howmuch you want to take time before another output
        }catch (Exception e){
        }
        System.out.println("Hiii");//2 step

    }
}

public class hellothreadMulti {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        obj.start();
        // System.out.println("Hiii");//1
    }
    
}
