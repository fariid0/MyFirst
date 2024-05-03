package src.Dersde.MentorMarket;

import java.util.HashMap;
import java.util.Map;

public class Supermarket {
    HashMap<Product, Integer> products;
    void addProduct(Product... product){
        for (Product p : product){
            products.put(p, 6);
        }
    };

    void removeProduct(int productId) {

    };

    void displayProducts(){
        for (Map.Entry<Product , Integer> entry : products.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
