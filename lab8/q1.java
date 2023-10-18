import java.lang.Math;

abstract class Shape {
    abstract double rectangleArea(double length, double breadth);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}

class Area extends Shape {
    double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    double squareArea(double side) {
        return side * side;
    }

    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class q1 {
    public static void main(String[] args) {
        Area areaCalculator = new Area();

        System.out.println("Area of a rectangle with length 5 and breadth 6: " +
                areaCalculator.rectangleArea(5, 6));

        System.out.println("Area of a square with side length 5: " +
                areaCalculator.squareArea(5));

        System.out.println("Area of a circle with radius 7: " +
                areaCalculator.circleArea(7));
    }
}
