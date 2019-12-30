package PointInRectangle;

public class Rectangle {
    private Point topLeft;
    private Point downRight;

    public Rectangle(Point topLeft, Point downRight) {
        this.topLeft = topLeft;
        this.downRight = downRight;
    }

    public boolean contains(Point point) {
        return point.getX() >= this.topLeft.getX() &&
                point.getX() <= this.downRight.getX() &&
                point.getY() <= this.downRight.getY() &&
                point.getY() >= this.topLeft.getY();

    }
}
