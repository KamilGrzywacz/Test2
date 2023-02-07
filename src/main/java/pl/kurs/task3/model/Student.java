package pl.kurs.task3.model;

import pl.kurs.task3.model.Person;

public class Student extends Person {
    private String group;
    private int scholarship;

    public Student(String name, String lastName, String pesel, String city, String group, int scholarship) {
        super(name, lastName, pesel, city);
        this.group = group;
        this.scholarship = scholarship;
    }

    public double getIncome() {
        return scholarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", group='" + group + '\'' +
                ", scholarship=" + scholarship +

                '}';
    }
}
