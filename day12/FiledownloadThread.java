package day12;

 class Downloadfile extends Thread{
    String filename;
    public Downloadfile(String filename){
        this.filename=filename;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(filename + " " + "downloading..." +(i*20) +" %");
            try{
                Thread.sleep(2000);
            }catch (Exception e){
            }
        }System.out.println(filename + " " + "done");
    }
    
    
}




public class FiledownloadThread {
    public static void main(String [] args){
        Downloadfile objA =new Downloadfile("A");
        Downloadfile objb =new Downloadfile("B");
        Downloadfile objc =new Downloadfile("c");
        
        objA.start();
        objb.start();
        objc.start();

        
    }
    
}
