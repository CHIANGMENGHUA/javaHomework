package phase2.hw4;

public class Manager extends Employee {

    private long bonus;

    public Manager(int empno, String name, long salary, long bonus) {
        super(empno, name, salary);
        this.bonus = bonus;
    }

    @Override
    public long getSalary() {
        return super.getSalary() + bonus;
    }
}
