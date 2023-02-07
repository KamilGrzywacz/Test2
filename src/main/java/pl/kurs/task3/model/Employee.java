package pl.kurs.task3.model;

public class Employee extends Person {
    private String career;
    private int salary;

    public Employee(String name, String lastName, String pesel, String city, String career, int salary) {
        super(name, lastName, pesel, city);
        this.career = career;
        this.salary = salary;
    }

    public double getIncome() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", career='" + career + '\'' +
                ", salary=" + salary +
                '}';
    }
}
