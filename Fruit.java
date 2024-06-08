public class Fruit {
    private double pricePerJin;
    private double weight;
    private double discount = 1.0;

    public Fruit(double pricePerJin) {
        this.pricePerJin = pricePerJin;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculatePrice() {
        return pricePerJin * weight * discount;
    }
}
