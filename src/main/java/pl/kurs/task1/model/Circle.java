package pl.kurs.task1.model;

public class Circle extends Figure {
    private double radius;


    public Circle(int radius) {
        this.radius = radius;

    }

    @Override
    public String toString() {
        return "Kolo o promieniu " +
                radius;

    }


    @Override
    public double areaCalculator() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeterCalculator() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
