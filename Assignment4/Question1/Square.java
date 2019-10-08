package Question1;

public class Square extends Shape {
    private final double side;

    public Square(double side) {
        setName("Square");
        this.side = side;
        setPerimeter(4 * side);
        setArea(side * side);
    }
}
