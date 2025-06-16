public class Singleton {
    private static Singleton instance;
    private Singleton(){
          System.out.println("Logger initialized");
    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
   
    public static void main(String args[]){
        Singleton log1=Singleton.getInstance();
    
        Singleton log2=Singleton.getInstance();
      
        if(log1==log2){
            System.out.print("Both has same instance");

        }
        else{
            System.out.println("Different instances");
        }
    }
}
