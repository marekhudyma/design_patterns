package mh.behavioral.composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeNode implements Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public EmployeeNode(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    @Override
    public void add(Employee e) {
        subordinates.add(e);
    }

    @Override
    public void print() {
        System.out.println("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");
        for(Employee e : subordinates) {
            e.print();
        }
    }
}
