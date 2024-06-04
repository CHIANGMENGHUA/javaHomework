package phase2.hw5;

public class Notebook extends Product {

    private double discount;//折扣

    public Notebook(String name, int price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}