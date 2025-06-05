package day12;

public class thread_2Day {
    public static void main(String[] args){
        System.out.println(("idher dekhoo"));

        Thread t1=new Thread ( ()->{
            System.out.println("hello");
        });
         try{
            Thread.sleep(2000); 
                    System.out.println("ham last me aainge");//2 step
        }catch (Exception e){
        


    }


        

        Thread t2 =new Thread ( ()->{
            System.out.println(("hiii"));
        });
        t1.start();
        t2.start();

    }
}
    

