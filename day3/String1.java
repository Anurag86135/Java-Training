package day3;

public class String1 {
    public static void main(String[] args) {
        String str ="nitin";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
// System.out.println(str.charAt(i));
       rev+=str.charAt(i);

        
// System.out.println(str);
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("pallindrome");

        }else{
            System.out.println("not");
        }
        
    }
    
}
