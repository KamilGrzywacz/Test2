package pl.kurs.task1.model;

import pl.kurs.task1.exeptions.InvalidFigureParameterException;

public abstract class Figure {

    public static Square makeSquare(int gon) throws InvalidFigureParameterException {

        if (gon > 0) {
            return new Square(gon);
        }
        throw new InvalidFigureParameterException("Bok nie może byc mniejszy od 0!");
    }

    public static Circle makeCircle(int radius) throws InvalidFigureParameterException {
        if (radius > 0) {
            return new Circle(radius);
        }
        throw new InvalidFigureParameterException("Promien nie może być mniejszy od 0");

    }

    public static Rectangle makeRectanlge(int gon1, int gon2) throws InvalidFigureParameterException {
        if (gon1 > 0 && gon2 > 0) {
            return new Rectangle(gon1, gon2);
        }
        throw new InvalidFigureParameterException("Każdy bok musi być dodatni");

    }

    @Override
    public String toString() {
        return  "Figure  {}";
    }


    public abstract double areaCalculator();

    public abstract double perimeterCalculator();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}