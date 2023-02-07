package pl.kurs.task1.model;

public class Square extends Figure {
    private double gon;
    private double area;
    private double perimeter;


    public Square(int gon) {
        this.gon = gon;
        this.area = gon * gon;
        this.perimeter = 4 * gon;
    }

    @Override
    public String toString() {
        return "Kwadrat o boku " + gon;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Square other = (Square) obj;
        return this.gon == other.gon;
    }

}
