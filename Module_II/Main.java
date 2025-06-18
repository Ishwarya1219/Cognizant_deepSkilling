public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "T-Shirt", "Clothing"),
            new Product(104, "Mobile", "Electronics"),
            new Product(105, "Watch", "Accessories")
        };
        System.err.println("Linear_Search: ");
        String name1="shoes";
        Product res1=LinearSearch.linear(products, name1);
        System.err.println(res1!=null? "Found: "+res1 : "Product not found");

        System.err.println("Binary_Search: ");
        String name2="laptop";
        Product res2=BinarySearch.binarySearch(products, name2);
        System.err.println(res2!=null? "Found: "+res2 : "Product not found");
}
}
