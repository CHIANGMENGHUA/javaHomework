package phase2.hw10;

public class Employee {

    private String id;
    private int salary;
    private int commission;

    public Employee(String id, int salary, int commission) {
        this.id = id;
        this.salary = salary;
        this.commission = commission;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int getCommission() {
        return commission;
    }
}
