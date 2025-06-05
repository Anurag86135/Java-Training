package day12;


    public class priorityA{
        public static void main(String[] args) {
            MyThread t1=new MyThread();
            MyThread t2 =new MyThread();
            
            t1.setName("low priority Thread");
            t2.setName("high Priority Thread");

             t1.setPriority(Thread.MIN_PRIORITY);//1//notify padlena ,ye abhi pura nahi hua hai
             t1.setPriority(Thread.MIN_PRIORITY);//10
             t1.start();
             t2.start();



        }
    }
     class priority {
    class MyThread extends Thread{
        public void run (){
            for(int i=1 ;i<=10 ;i++){
                System.out.println(getName() + "is running with priority");
                Thread.yield();
            }
        }
    }
}
    
    

