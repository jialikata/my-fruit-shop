public class Fruit {
    private double pricePerJin;
    private int weight;
    private double discount = 1.0;

    public Fruit(double pricePerJin) {
        this.pricePerJin = pricePerJin;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculatePrice() {
        return pricePerJin * weight * discount;
    }
}
