package day13;



public class TraversingInArray{
  static void Multi(){
    int[][] arr={{1,22,44},{49,55,90}};

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
    }
   

}

    public static void main(String[] args) {
        
    String [] Name ={"ANURAG","SITARAM","gHANSHYAM","RAGHERADHE"};
    char [] Alphabets={'a','b','c','a'};
    int [] ages ={12,34,55};
    for(int i=0;i<=2;i++){//through for loop
        System.out.println(ages[i]);

        
    }
    // public String toString(){
    //     return Name;
    
    for(String g:Name){//through for each loop
            System.out.println(g);
        }

        char i=0;
        while(i<Alphabets.length){//through while loop
            System.out.println(Alphabets[i]);
           i++;

        }
    Multi();
    }
    

}