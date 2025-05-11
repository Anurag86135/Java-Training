package day10;

 class Rect {//. Create a class `Rectangle` with private fields `length` and `width`. Write setter methods to assign
    // values and getter methods to return area and perimeter
    private float length;
    private float breadth;
    void setdata(int Lenght,int width){
        length=Lenght;
        breadth=width;

    }
    float[] getdata(){
        float Area=(length*breadth);
        System.out.println("the area of the Rectangle is "+ Area);

        float perimeter=2*(length+breadth);
        System.out.println("the perimeter of the Rectangle "+ perimeter);
        return new float[]{Area,perimeter};

    }

    
}public class Rectangle{
    public static void main(String[] args) {
        Rect obj=new Rect();
        obj.setdata(4,5);
        obj.getdata();
    }
}
