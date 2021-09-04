package company.employee.implementation;

import company.employee.Employee;

public class Programmer extends Employee {

    private String language;

    @Override
    public void work() {
        System.out.println("Прогрммист кодит и плачет");

    }

    @Override
    public boolean drinktea(String tea) {
        return tea != null;

    }

    public void fixBug (String bugName){
        System.out.printf("Bug %10s was fixed", bugName);
    }
}
