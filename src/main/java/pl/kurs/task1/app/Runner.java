package pl.kurs.task1.app;

import pl.kurs.task1.exeptions.InvalidFigureParameterException;
import pl.kurs.task1.model.Figure;
import pl.kurs.task1.service.Service;

public class Runner {
    public static void main(String[] args) throws InvalidFigureParameterException {

        Figure[] figures= {Figure.makeSquare(10), Figure.makeCircle(10), Figure.makeRectanlge(10, 20), Figure.makeSquare(15)};

        for (Figure f : figures) {
            System.out.println(f);
        }
        System.out.println("Figura z najwi " + Service.calculatePerimeter(figures));
        System.out.println("Figura z największym polem to : " + Service.calculateArea(figures));

        for(Figure f : figures) {
            if(f.equals(Figure.makeRectanlge(10,20))){
                System.out.println("tu powinno wejsc");
            }
        }


    }
}



