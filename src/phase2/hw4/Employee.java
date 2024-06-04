package phase2.hw4;

public class Employee {

    private int empno; //員工編號
    private String name; //員工姓名
    private long salary; //薪水

    public Employee(int empno, String name, long salary) {
        this.empno = empno;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpno() {
        return empno;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }
}
