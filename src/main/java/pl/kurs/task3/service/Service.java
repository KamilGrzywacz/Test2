package pl.kurs.task3.service;

import pl.kurs.task3.model.Person;

public class Service {
    public static Person theBestIncome(Person[] people) {
        Person personWithTheBestIncome = people[0];
        for (int i = 0; i < people.length; i++) {
            if (people[i].getIncome() > personWithTheBestIncome.getIncome()) {
                personWithTheBestIncome = people[i];
            }

        }
        return personWithTheBestIncome;
    }

    public static double getPlec(Person[] people) {
        double womenInArray = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getPesel().charAt(9) == '0') {
                womenInArray++;
            }
            if (people[i].getPesel().charAt(9) == '2') {
                womenInArray++;
            }
            if (people[i].getPesel().charAt(9) == '4') {
                womenInArray++;
            }
            if (people[i].getPesel().charAt(9) == '6') {
                womenInArray++;
            }
            if (people[i].getPesel().charAt(9) == '8') {
                womenInArray++;
            }
        }
        return womenInArray;
    }
}


