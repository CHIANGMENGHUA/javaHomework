package phase2.hw5;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public static void main(String[] args) {

        List<Product> shoppingList = new ArrayList<Product>();
        int sum = 0;
        double sumOfNotebook = 0;

        //實作1.加入二台
        //Notebook("Asus",30000,0.85),Notebook("Acer",20000,0.9),Food("Cookie",200)

        Notebook nb1 = new Notebook("Asus",30000,0.85);
        Notebook nb2 = new Notebook("Acer",20000,0.9);
        Food fd = new Food("Cookie",200);

        shoppingList.add(nb1);
        shoppingList.add(nb2);
        shoppingList.add(fd);

        //實作2.利用for迴圈，計算shoppingList中的總金額不用計折扣,並印在Console中

        for (Product product : shoppingList) {
            sum += product.getPrice();
        }
        System.out.println("shoppingList中的總金額不用計折扣: " + sum);

        //實作3.利用for迴圈，計算shoppingList中是Notebook型態的總金額(請加計折扣),並印在Console中

        for (Product product : shoppingList) {
            if (product instanceof  Notebook notebook) {
                sumOfNotebook += notebook.getPrice() * notebook.getDiscount();
            }
        }
        System.out.println("shoppingList中是Notebook型態的總金額(請加計折扣): " + sumOfNotebook);
    }
}
