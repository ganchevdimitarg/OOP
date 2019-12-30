package Polymorphism.Lab;

public abstract class Shape {
    private double perimeter;
    private double area;

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getPerimeter() {
        return perimeter;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    protected abstract double calculatePerimeter();
    protected abstract double calculateArea();
}
