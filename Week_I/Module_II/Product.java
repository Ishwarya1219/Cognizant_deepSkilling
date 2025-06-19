public class Product {
    int productId;
    String productName,category;

    public Product(int id,String name,String category) {
        productId=id;
        productName=name;
        this.category=category;
    }  
    @Override
    public String toString(){

        return "[ "+ productId+" , "+productName+" , "+category+" ]";
    }  
    
}

