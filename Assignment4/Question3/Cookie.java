package Question3;

public class Cookie extends DessertItem {
    public int number;
    public double price;

    public Cookie (String name, int number, double price) {
        setName(name);
        this.number = number;
        this.price = price;
    }
    public int getCost() {
        return (int)Math.round(price/12 * number) ;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
