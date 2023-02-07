package pl.kurs.task3.app;

import pl.kurs.task3.model.Employee;
import pl.kurs.task3.model.Person;
import pl.kurs.task3.model.Student;
import pl.kurs.task3.service.Service;

public class Runner {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        people[0] = new Student("Kamil", "Kubiś", "99012902071", "Kolbuszowa", "2B", 2000);
        people[1] = new Student("Karolina", "Stadnicka", "99031202001", "Rzeszów", "4D", 1500);
        people[2] = new Student("Wiktoria", "Brzoza", "88041302021", "Mielec", "3A", 1500);
        people[3] = new Student("Dominika", "Blicharz", "88092302041", "Dębica", "1C", 1500);
        people[4] = new Student("Kuba", "Chołody", "99080704054", "Przemyśl", "2B", 1500);
        people[5] = new Employee("Adam", "Kowalski", "74061315957", "Przeworsk", "Dirver", 10_000);
        people[6] = new Employee("Tomasz", "Grzybowski", "89061315937", "Hadykówka", "judge", 20_000);
        people[7] = new Employee("Agata", "Wilk", "86041313868", "Głogów", "beautician", 2000);
        people[8] = new Employee("Renata", "Komaniecka", "76030813889", "Kielnarowa", "chef", 800);
        people[9] = new Employee("Rafał", "Opaliński", "85052503091", "Cmolas", "lumberer", 4500);

        System.out.println("Osoba z najwyższym dochodem to : " + Service.theBestIncome(people));
        System.out.println("Ilość kobiet w tablicy to :  " + Service.getPlec(people));
    }


}
