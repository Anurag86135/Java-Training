package day7;

public class OOP {
    class Pen{
    String colour;
    String type ;
    public void write(){
        System.out.println("writing something");

    }
    public void printColour(){
        System.out.println(this.colour);

    }
    
}
public static void main (){
    Pen pen1= new Pen();
    pen1.colour ="blue";
    pen1.type="gel";

    Pen pen2 =new Pen();
    pen2.colour ="black";
    pen2.type="ballpoint";
    pen1.printColour();
}
}