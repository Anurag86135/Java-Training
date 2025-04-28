package day3;

public class Anurag {//delete duplicate character in the given string
    public static void main(String[] args) {
        String str="hello";;
        String str1="";

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(str1.indexOf(c)==-1){
                str1+=c;
            }
        }
        System.out.println(str1);
    }
    
}
