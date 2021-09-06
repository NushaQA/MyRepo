package company.employee.implementation;

import company.employee.Employee;

public class Programmer extends Employee {

    private String language;

    public Programmer(String name, String jobTitle, double salary) {

        super(name, jobTitle, salary);

    }

    public Programmer(String name, String jobTitle, double salary, String language) {

        super(name, jobTitle, salary);
        this.language = language;

    }

    @Override
    public void work() {
        System.out.println("Прогрммист кодит и плачет");

    }

    @Override
    public boolean drinkTea(String tea) {
        return tea != null;

    }

    public void fixBug(String bugName) {
        System.out.printf("Bug %10s was fixed", bugName);
    }
}
