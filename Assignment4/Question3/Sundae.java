package Question3;

public class Sundae extends IceCream {
    private String topping;
    private int costOfTopping;
    public Sundae(String name, int costOfIceCream, String topping, int costOfTopping) {
        super(name, costOfIceCream);
        this.topping = topping;
        this.costOfTopping = costOfTopping;
        setCost(costOfIceCream + costOfTopping);
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public int getCostOfTopping() {
        return costOfTopping;
    }

    public void setCostOfTopping(int costOfTopping) {
        this.costOfTopping = costOfTopping;
    }
}
