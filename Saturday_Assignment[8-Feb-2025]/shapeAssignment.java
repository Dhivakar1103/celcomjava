package assignment;

class Shape {
    public double getArea() {
        return 0;
    }
}

class Rectangle1 extends Shape {
    private double length;
    private double width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

public class shapeAssignment {
    public static void main(String[] args) {
        Rectangle1 rectangle = new Rectangle1(5, 10);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}
