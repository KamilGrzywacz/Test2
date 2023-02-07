package pl.kurs.task1.model;

public class Circle extends Figure {
    private double radius;
    private double diameter;

    private double area;
    private double perimeter;

    public Circle(int radius) {
        this.radius = radius;
        this.diameter = radius + radius;
        this.perimeter = 2 * 3.14 * radius;
        this.area = 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "Kolo o promieniu " +
                radius;

    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
