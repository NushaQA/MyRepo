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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println("Programmer is responsible for development");
    }

    @Override
    public boolean drinkTea(String tea) {
        return tea != null;
    }

    @Override
    public void vacationcomplete (int duration) {
        if (duration >=24) {
            System.out.println("Vacation is completed");
        }
        else {
            System.out.println("Vacation is still not completed");
        }
    }

    public void fixBug(String bugName) {
        System.out.printf("Bug %10s was fixed", bugName);
    }

}
