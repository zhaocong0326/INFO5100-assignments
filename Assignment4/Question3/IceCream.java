package Question3;

public class IceCream extends DessertItem {
    public int cost;

    public IceCream(String name, int cost) {
        setName(name);
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
