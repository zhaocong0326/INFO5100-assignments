package Question1;

public class Shape {
    protected String name;
    public double perimeter;
    public double area;

    public Shape() {
        this("Shape");
    }

    public Shape(String name) {
        this.name = name;

    }

    public Shape(String name, double perimeter) {
        this(name);
        this.perimeter = perimeter;
    }

    public Shape(String name, double perimeter, double area) {
        this(name, perimeter);
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println("Drawing " + name);
    }


    public double getPerimeter() {
        System.out.println(perimeter);
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        System.out.println(area);
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
