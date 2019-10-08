package Question3;

public class TestCheckOut {
    public static void main(String[] args) {
        CheckOut checkOut = new CheckOut();

        checkOut.enterItem(new Candy("Peanu Butter Fudge", 2.25, 399));
        checkOut.enterItem(new IceCream("Vanilla ICE Cream", 105));
        checkOut.enterItem(new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50));
        checkOut.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));

        System.out.println("\nNumber of items: " + checkOut.numberOfItems() + "\n");
        System.out.println("\nTotal cost: " + checkOut.totalCost() + "\n");
        System.out.println("\nTotal tax:  " + checkOut.totalTax() + "\n");
        System.out.println("\nCost + Tax: " + (checkOut.totalCost() + checkOut.totalTax()) + "\n");
        System.out.println(checkOut);

        checkOut.clear();
        checkOut.enterItem(new IceCream("Strawberry Ice Cream", 145));
        checkOut.enterItem(new Sundae("Vanilla Ice Cream", 105, "Caramel",50));
        checkOut.enterItem(new Candy("Gummy Worms", 1.33, 89));
        checkOut.enterItem(new Cookie("Chocolte Chip Cookies", 4, 399));
        checkOut.enterItem(new Candy("Salt Walter Traffy", 1.5, 209));
        checkOut.enterItem(new Candy("Candy Corn", 3.0, 109));

        System.out.println("\nNumber of items: " + checkOut.numberOfItems() + "\n");
        System.out.println("\nTotal cost: " + checkOut.totalCost() + "\n");
        System.out.println("\nTotal tax:  " + checkOut.totalTax() + "\n");
        System.out.println("\nCost + Tax: " + (checkOut.totalCost() + checkOut.totalTax()) + "\n");
        System.out.println(checkOut);
    }
}
