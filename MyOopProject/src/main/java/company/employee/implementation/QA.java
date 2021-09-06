package company.employee.implementation;

import company.employee.Employee;

public class QA extends Employee {

    private String typeQa; //Manual or Automation

    public QA(String name, String jobTitle, double salary) {

        super(name, jobTitle, salary);

    }

    public QA(String name, String jobTitle, double salary, String typeQa) {

        super(name, jobTitle, salary);
        this.typeQa = typeQa;

    }

    public QA(String name, String jobTitle, double salary) {

        super(name, jobTitle, salary);

    }

    @Override
    public void work() {
        System.out.println("Тестят");
    }

    @Override
    public boolean drinkTea(String tea) {
        switch (tea) {
            case "Green tea":
                return true;
            default:
                return false;
        }
    }

    public String reportBug(int bugId) {
        return "Bug_With_Bug_Id" + bugId;
    }

}
