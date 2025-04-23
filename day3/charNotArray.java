package day3;

public class charNotArray {
    public static void main(String[] args) {
        String str="Anuragg";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println("the duplicate character in the given "+str+ " is  "+ "'"+str.charAt(j)+"'");
                    return;
                }
            }
        }
    }
    
}
