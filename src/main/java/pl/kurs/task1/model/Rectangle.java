package pl.kurs.task1.model;

public class Rectangle extends Figure {
    private int gon1;
    private int gon2;
    private double area;
    private double perimeter;


    public Rectangle(int gon1, int gon2) {
        this.gon1 = gon1;
        this.gon2 = gon2;
        this.perimeter = (2 * gon1) + (2 * gon2);
        this.area = gon1 * gon2;
    }

    @Override
    public String toString() {
        return "Prostokat o bokach " +
                gon1 +
                "x" + gon2;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle other = (Rectangle) obj;
        return this.gon1 == other.gon1 && this.gon2 == other.gon2;
    }


}
