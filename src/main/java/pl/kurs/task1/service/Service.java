package pl.kurs.task1.service;

import pl.kurs.task1.model.Figure;

public class Service {
    public static Figure calculatePerimeter(Figure[] figures) {
        Figure theMostPerimeter = figures[0];
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getPerimeter() > theMostPerimeter.getPerimeter()){
                theMostPerimeter = figures[i];
            }
        }
        return theMostPerimeter;
    }
    public static Figure calculateArea(Figure[] figures) {
        Figure theMostArea = figures[0];
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getPerimeter() > theMostArea.getArea()){
                theMostArea = figures[i];
            }
        }
        return theMostArea;
    }
}
