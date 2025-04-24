package day3;

public class String5 {
    public static void main(String[] args) {
        //count the vowels in a string;
        String input = "Anurag";
        int count= 0;
        for(char c: input.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                count++;
            }
        }System.out.println("Vowels:"+ count);
    }
    
}
