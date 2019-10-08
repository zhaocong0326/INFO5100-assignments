package Question3;

public class Candy extends DessertItem {
    private double weight;
    private double price;

    public Candy(String name, double weight, double price) {
       setName(name);
        this.weight = weight;
        this.price = price;
    }

    public int getCost() {
        return (int)Math.round(weight * price);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
