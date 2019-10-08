package Question1;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        setName("Rectangle");
        this.width = width;
        this.height = height;
        setPerimeter(2 * (width + height));
        setArea(width * height);
    }

}
