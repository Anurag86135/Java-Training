package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpression {

    public static void main(String[] args) {
        Runnable r=() ->System.out.println("Runnable using lambda");
        r.run();
        
    }
    
}

class RunnableTraditional{
    public static void main(String[] args) {
        Runnable r= new Runnable(){
            public void run(){
                System.out.println("Runnable using lambda expression");
            }
        };
        r.run();
    }
}
  
class hello{
     public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("ranu");
        list.add("mohit");
        list.add("kohli");

    //     Collections.sort(list ,new Comparator<String>(){
    //     public int compare(String a,String b){
    //         return a.compareTo(b);
    //     }


   // });
        // System.out.println(list);//

     Collections.sort(list,(a,b)->a.compareTo(b));
     System.out.println(list);
}
 }