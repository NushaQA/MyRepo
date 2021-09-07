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

    public String getTypeQa() {
        return typeQa;
    }

    public void setTypeQa(String typeQa) {
        this.typeQa = typeQa;
    }

    @Override
    public void work() {
        System.out.println("QA is responsible for verification");
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

    @Override
    public void vacationcomplete (int duration) {
        if (duration >=26) {
            System.out.println("Vacation is completed");
        }
        else {
            System.out.println("Vacation is still not completed");
        }
    }

    public String reportBug(int bugId) {
        return "Bug_With_Bug_Id" + bugId;
    }

}
