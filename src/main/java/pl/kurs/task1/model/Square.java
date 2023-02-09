package pl.kurs.task1.model;

public class Square extends Figure {
    private double gon;


    public Square(int gon) {
        this.gon = gon;

    }

    @Override
    public String toString() {
        return "Kwadrat o boku " + gon;
    }


    @Override
    public double areaCalculator() {
        return gon * gon;
    }

    @Override
    public double perimeterCalculator() {
        return 4 * gon;
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
