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

        System.out.println("Area of a rectangle with length 5 and breadth 3: " +
                areaCalculator.rectangleArea(5, 3));

        System.out.println("Area of a square with side length 4: " +
                areaCalculator.squareArea(4));

        System.out.println("Area of a circle with radius 6: " +
                areaCalculator.circleArea(6));
    }
}
