package Question3;

public class DessertShop {
    public double taxRate = 0.065;
    public String name;

    public String cents2dollersAndCents (Integer cents) {
        double cent = cents/100;
        return Double.toString(cent);
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

}
