import java.util.*;
public class BinarySearch {
    public static void sortProducts(Product[] products) {
        Arrays.sort(products,Comparator.comparing(p->p.productName.toLowerCase()));
    }
    public static Product binarySearch(Product[] pros,String name){
        int left=0,right=pros.length-1;

        while(left<=right){
            int mid=(left+right)/2;
            int cmp=pros[mid].productName.compareToIgnoreCase(name);
            if(cmp==0)
        
            return pros[mid];
            if(cmp<0)
             {left=mid+1;}
            else right=mid-1;
        }
        return null;
    }
}
