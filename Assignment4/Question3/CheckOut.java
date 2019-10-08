package Question3;

import java.util.*;
public class CheckOut {
    List<DessertItem> items;
    private DessertShop dessertShop;

    public CheckOut() {
        items = new ArrayList<>();
        dessertShop = new DessertShop();
    }

    public void enterItem(DessertItem item) {
        items.add(item);
    }

    public int numberOfItems() {
        int num = items.size();
        return num;
    }

    public int totalCost() {
        int sum = 0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).getCost();
        }
        return sum;
    }

    public int totalTax() {
        double tax = this.totalCost() * dessertShop.getTaxRate();
        return (int)Math.round(tax);
    }

    public void clear() {
        items = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append("       ");
        s.append("M & M Dessert Shop");
        s.append("       \n     ");
        s.append("--------------------      \n");
        for (int i = 0; i < items.size(); i++) {
            DessertItem dessertItem = items.get(i);
            if (dessertItem.getClass() == IceCream.class) {
                IceCream iceCream = (IceCream) dessertItem;
                s.append("\n" + iceCream.name);
                for (int k = 0; k < 35 - iceCream.name.length(); k++) {
                    s.append('-');
                }
                s.append((double)iceCream.getCost() / 100);
            } else if (dessertItem.getClass() == Sundae.class) {
                Sundae sundae = (Sundae) dessertItem;
                s.append("\n" + sundae.getTopping());
                s.append("Sundae with");
                s.append("\n" + sundae.name);
                for (int k = 0; k < 35 - sundae.name.length(); k++) {
                    s.append('-');
                }
                s.append((double)sundae.getCost() / 100);
            } else if (dessertItem.getClass() == Candy.class) {
                Candy candy = (Candy) dessertItem;
                s.append("\n" + candy.getWeight() + "lbs. @ ");
                s.append(candy.getPrice() + "/lb.");
                s.append("\n" + candy.name);
                for (int k = 0; k < 35 - candy.name.length(); k++) {
                    s.append('-');
                }
                s.append((double)candy.getCost() / 100);
            } else {
                Cookie cookie = (Cookie) dessertItem;
                s.append("\n" + cookie.getNumber() + " @ ");
                s.append(cookie.getPrice() + " /dz.");
                s.append("\n" + cookie.name);
                for (int k = 0; k < 35 - cookie.name.length(); k++) {
                    s.append('-');
                }
                s.append((double)cookie.getCost() / 100);
            }
        }
        s.append("\n\nTax");
        for (int k = 0; k < 33; k++) {
            s.append('-');
        }
        s.append(r((double)totalTax() / 100));
        s.append("\nTotal Cost");
        for (int k = 0; k <24; k++) {
            s.append('-');
        }
        double p = (double)(totalCost() + totalTax()) / 100;
        s.append(p);
        return s.toString();
    }

    private String r(double value) {
        String res = Double.toString(value);

        if (value < 1) {
            res = res.substring(1);
        }

        return res;
    }
}
