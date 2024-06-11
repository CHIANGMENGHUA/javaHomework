package phase2.hw10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee("001",10000,300);
        Employee e2 = new Employee("002",10000,200);
        Employee e3 = new Employee("003",20000,200);
        Employee e4 = new Employee("004",30000,200);
        Employee e5 = new Employee("005",10000,300);

        List<Employee> list = Arrays.asList(e1, e2, e3, e4,e5);

        //請利用List中的sort方法重新排序e1..e5，排序時薪水(salary)大的排前面，如果薪水一樣則commission小的排前面
        //如果薪水commission都一樣，以員工編號由小到大排序

        list.sort(Comparator.comparing(Employee::getSalary).reversed()
                .thenComparing(Employee::getCommission)
                .thenComparing(Employee::getId));

        // 測試排序結果
        int counter = 1;
        System.out.println("測試排序結果:");
        for (Employee e : list) {
            System.out.printf
                    (
                     "%d -> ID: %s, salary: %d, commission: %d%n",
                     counter,
                     e.getId(),
                     e.getSalary(),
                     e.getCommission()
                    );
            counter++;
        }

        System.out.println(list);
    }
}
