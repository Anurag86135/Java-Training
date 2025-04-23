package day3;

public class String2 {
    public static void main(String[] args) {
        String str ="helllo";
        String newstr ="";
        for(int i=0;i<str.length();i++){
            char c =str.charAt(i);

            if(newstr.indexOf(c)==-1){
                newstr+=c;
            }
            


        }
         System.out.println(newstr);

    }
    