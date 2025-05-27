package AreaOfRect;

public class RectangleArea {
    private double length;
    private double breadth;

    public RectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        RectangleArea rect = new RectangleArea(10, 5);
        System.out.println("Area of Rectangle: " + rect.getArea());
    }
}