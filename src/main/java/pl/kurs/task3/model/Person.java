package pl.kurs.task3.model;

public abstract class Person {
    private String name;
    private String lastName;
    private String pesel;
    private String city;

    public Person(String name, String lastName, String pesel, String city) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.city = city;
    }

    public abstract double getIncome();

    public String getPesel() {
        return pesel;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
