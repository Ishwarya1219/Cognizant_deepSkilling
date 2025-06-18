public class LinearSearch {

    public static Product linear(Product[] pros,String name){

        for(Product p:pros){
            if(p.productName.equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;

    }
    
}
