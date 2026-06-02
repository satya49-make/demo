package com.example.javas.jeevan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TopThreeSalariesFromItDept {
    public static void main(String[] args) {
        List<Employee> list = Employee.users.stream()
                .filter(emp -> emp.dept().equals("phy"))
                .sorted((e1, e2) -> Long.compare(e2.salary(), e1.salary()))
                .limit(3)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    public record Employee(String name, long salary, String dept) {
        public static final List<TopThreeSalariesFromItDept.Employee> users = new ArrayList<>();

        static {
            users.add(new TopThreeSalariesFromItDept.Employee("jeevan ", 9000, "phy"));
            users.add(new TopThreeSalariesFromItDept.Employee("hello ", 6000, "chem"));
            users.add(new TopThreeSalariesFromItDept.Employee("hi ", 7000, "phy"));
            users.add(new TopThreeSalariesFromItDept.Employee("bye ", 19000, "phy"));
        }
    }
}
