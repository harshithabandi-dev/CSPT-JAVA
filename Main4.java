class Shape {
    void calculateArea() {
        System.out.println("Area Calculation");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Circle = " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

public class Main4 {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(10, 4);
        Triangle t = new Triangle(8, 6);

        c.calculateArea();
        r.calculateArea();
        t.calculateArea();
    }
}