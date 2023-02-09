package pl.kurs.task1.app;

import pl.kurs.task1.exeptions.InvalidFigureParameterException;
import pl.kurs.task1.model.Circle;
import pl.kurs.task1.model.Figure;
import pl.kurs.task1.service.Service;

public class Runner {
    public static void main(String[] args) throws InvalidFigureParameterException {

        Figure[] figures = {Figure.makeSquare(10), Figure.makeCircle(10), Figure.makeRectanlge(10, 20), Figure.makeSquare(15)};

        for (int i = 0; i < figures.length; i++) {
            System.out.println("Figura nr " + (i + 1) + ": "+ figures[i].toString());
        }

        System.out.println("Figura z największym obowodem to " + Service.calculatePerimeter(figures));
        System.out.println("Figura z największym polem to : " + Service.calculateArea(figures));
        System.out.println("---------------------------------------------------------------------------");


        for (Figure f : figures) {
            if (f.equals(Figure.makeRectanlge(10, 20))) {
                System.out.println("tu powinno wejsc");
            }
        }

    }
}



