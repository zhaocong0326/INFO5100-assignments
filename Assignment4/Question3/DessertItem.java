package Question3;

public abstract class DessertItem {
    public String name;

    public DessertItem() {

    }

    public DessertItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getCost();

}
