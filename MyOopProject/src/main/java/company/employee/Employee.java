package company.employee;

public abstract class Employee {

    protected String name;
    protected String jobTitle;
    protected double salary;


    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public abstract void work();

    public abstract boolean drinkTea(String tea);

    public abstract void vacationcomplete (int duration);

    public void assessmentresult(boolean result) {
        if (result) {
            System.out.println("Assessment is passed");
        } else {
            System.out.println("Assessment is not passed");
        }
    }

    public void sleep(int hours) {
        System.out.println("поспал" + hours + "часов");
        if (hours < 8) {
            System.out.println("не выспался, очень злой");
        } else {
            System.out.println("выспался, добрый");
        }
    }


}
