package company.employee.implementation;

import company.employee.Employee;

public class QA extends Employee {

    @Override
    public void work() {
        System.out.println("Тестят");
    }

    @Override
    public boolean drinktea(String tea) {
        switch (tea) {
            case "Green tea":
                return true;
            default:
                return false;
        }
    }

    public String reportBug(int bugId) {
        return "Bug_With_Bug_Id" = bugId;
    }

}
