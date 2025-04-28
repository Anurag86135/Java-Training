package day5;

public class functios {
    // static void numbersN (int n){
    //     for(int i=0;i<n;i++){
    //         System.out.println(i);

    //     }


    // }

    // static void SumOfEven(int initial ,int fin){
    //     // int initial =10;
    //     // int final =30;
    //     int sum=0;
    //     for(int i=initial;i<=fin;i++){
    //         if(i%2==0){
    //             sum+=i;
    //         }
    //     }
    //     System.out.println(sum);
    // }
    // static void PrintEven(int initial , int fin){
    //     for(int i=initial;i<fin;i++){
    //         if(i%2==0){

            
    //         System.out.println(i);
    //         }
    //     }}
        // //4.	WAP to find sum of 'n' natural numbers
        // static void SumNatural (int n){
        //     int sum=0;
        //     for(int i=1;i<=n;i++){
                
        //         sum+=i;
        //     }System.out.println("sum of natural numbers upto as given input is :"+sum);

            //find the product of N inputs of natural numbers
            static int ProductNatural(int num){
            int product=1;
            for(int i=1;i<=num;i++){
                product*=i;
            
            }
            return product;

        
    }
    //wap to extract and display all digits from the number and display that number
    static void extractNumber(int number){
        if(number==0){
            System.out.println("0");
            return ;
        }
        if (number<0){
            number=-number;
        }
        String str=Integer.toString(number);
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
    }
    static void digitSum(int number){
        int temp=number;
        int sum=0;
        while(temp!=0){
            int lastDigit=temp%10;
            sum+=lastDigit;
            temp/=10;
        }
        System.out.println("the sum of "  +number+" is: "+sum);
    }
    
    // 8 WAP tocount the digits of the given number
    static void digitCount(int number){
        int count=0;
        if(number==0){
            System.out.println("count = 1") ;
        }
        else{
            
            
            while(number!=0){
                number/=10;
                count++;
            }
            System.out.println("the count of the given number is  is "+count);
        }

    }
    // write a program to reverse the given number
    static void ReverseNumber(int number){
        // int number=1234;
        System.out.println("the original number is "+ number);
        int Reverse=0;
        while(number!=0){
           int digit= number % 10;//get the last digit from the number
            Reverse=Reverse*10 + digit;
            // remove the last digit
            number=number/10;

        }
        System.out.println("the Reverse number is"+ Reverse);
    }

    //Check the numer is pallindrime or not
    static void pallindrome(int number){
        int original=number;
        System.out.println("original number :"+number);
        int reverse=0;
        while(number>0){
           int digit=number%10;
            reverse=reverse*10+digit;
            number=number/10;
        }System.out.println("Reverse number is :"+reverse);

        if(original==reverse){
            System.out.println("the given number is pallinrome");
        }else
        System.out.println("not a pallindrome");
    }

    
    public static void main(String[] args) {
        //numbersN(8);
        //SumOfEven(1,5);
        // PrintEven(1,10);
        //SumNatural(5);
        // (int num=5;
        // int product=ProductNatural(num);
        // System.out.println("the product of natural numbers upto input is:" +product);)
       // extractNumber(58923);
       // digitSum(2334);
      // digitCount(0);
    //   ReverseNumber(98765);
    //pallindrome(121);

    }
}
    

