package day14;

public class SwapTwoElement {

    static void WithoutTemp(int a,  int b){
        System.out.println("Element before swpping");
        System.out.println("a -"+a);
        System.out.println("b -"+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Element After Swapping");
        System.out.println("a -"+a);
        System.out.println("b -"+b);

    }

    public static void swapping(int a, int b){

        System.out.println("elements before swapping ");
        System.out.println("a -"+ a);
        System.out.println("b -"+b);


        int temp=a;
        a=b;
        b=temp;
        System.out.println("elements After swapping");
        System.out.println("a -"+ a);
        System.out.println("b -"+ b );
    }
    public static void main(String[] args){
        int a=22,b=33;
       // swapping(a,b);

        WithoutTemp(a,b);

    }
    
}
