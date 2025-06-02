
package day12;


import java.beans.Statement;
import java.util.ArrayList;
import java.util.Collections;

public class student implements Comparable<student>{
    int age;
    String name ;

    public student(int age,String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return age + " " + name;
    }
    public int compareTo(student s){
        return this.age-s.age;
    }

   
    }

    class Hello{
    public static void main(String[] args) {
        ArrayList<student> list =new ArrayList<>();
        list.add(new student(17, "rahul"));
        list.add(new student(16, "rohit"));
        list.add(new student(11, "mohit"));
        list.add(new student(51, "om"));

           Collections.sort(list);
           for(student s :list){
            System.out.println(s.toString());
           }

        // list.add(0);
        // list.add(5);
        // list.add(6);

        // Collections.sort(list);
        // System.out.println(list);





        
    }
}
    

