package company.employee;

public abstract class Employee {

    protected String name;
    protected String jobTitle;
    protected double salary;


    public Employee(String name, String jobTitle, double salary){

       this.name = name;
       this.jobTitle = jobTitle;
       this.salary = salary;

    }

    public String getName() {

        return name;
    }

    public String getJobTitle() {

        return jobTitle;
    }

    public abstract void work();

    public abstract boolean drinkTea(String tea);

    public void sleep(int hours) {
        System.out.println("поспал" + hours + "часов");
        if (hours < 8) {
            System.out.println("не выспался, очень злой");
        } else {
            System.out.println("выспался, добрый");
        }
    }

}
