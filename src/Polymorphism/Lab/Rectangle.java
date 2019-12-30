package Polymorphism.Lab;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.setHeight(height);
        this.setWidth(width);
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private double getHeight() {
        return height;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private double getWidth() {
        return width;
    }

    @Override
    protected double calculatePerimeter() {
        return (this.getHeight() + this.getWidth()) * 2;
    }

    @Override
    protected double calculateArea() {
        return this.getWidth() * this.getHeight();
    }
}
