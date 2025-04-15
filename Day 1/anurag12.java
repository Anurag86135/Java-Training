public class anurag12 {
    public static void main(String[] args) {
        //prime or not
        int num = 7;
        boolean isprime = true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isprime =false;
                break;
            }
        }
    }System.out.println(isprime ? "prime":"Not prime");

    
    
}
