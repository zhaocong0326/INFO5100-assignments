package Question1;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        setName("Circle");
        setPerimeter(calPerimeter(radius));
        setArea(calArea(radius));
    }

    private double calPerimeter(double radius){
        String p = Double.toString(2 * Math.PI * radius).substring(0, 5);
        return Double.valueOf(p);
    }

    private double calArea(double radius){
        String a = Double.toString(Math.PI * radius * radius).substring(0, 5);
        return Double.valueOf(a);
    }


}
