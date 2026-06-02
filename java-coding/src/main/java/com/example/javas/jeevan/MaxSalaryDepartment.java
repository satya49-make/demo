package com.example.javas.jeevan;

import java.util.*;
import java.util.stream.Collectors;

public class MaxSalaryDepartment {
    public static void main(String[] args) {
        Map<String, Optional<Employee>> result = Employee.users.stream()
                .collect(Collectors.groupingBy(
                        Employee::dept,
                        Collectors.maxBy(Comparator.comparing(Employee::salary))));
        System.out.println(result);
    }

    public record Employee(String name, long salary, String dept) {
        public static final List<Employee> users = new ArrayList<>();

        static {
            users.add(new Employee("jeevan ", 9000, "phy"));
            users.add(new Employee("hello ", 6000, "chem"));
            users.add(new Employee("hi ", 7000, "phy"));
            users.add(new Employee("bye ", 19000, "phy"));
        }
    }
}
