package com.example.javas.code;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Employee {
    int id;
    String name;
    String department;
    double salary;
    int age;
    private LocalDate joiningDate;

 public Employee(int id, String name, String department, double salary, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }
 public Employee(int id, String name, String department, double salary, int age, LocalDate joiningDate) {
     this.id = id;
     this.name = name;
     this.department = department;
     this.salary = salary;
     this.age = age;
     this.joiningDate = joiningDate;
 }

 public LocalDate getJoiningDate() { return joiningDate; }
 public void setJoiningDate(LocalDate joiningDate) { this.joiningDate=joiningDate; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age  + ", joined " + joiningDate +
                '}';
    }

    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Amit", "IT", 75000, 28),
                new Employee(2, "Neha", "HR", 68000, 32),
                new Employee(3, "Rahul", "Finance", 82000, 35),
                new Employee(4, "Priya", "IT", 90000, 30),
                new Employee(5, "Ankit", "HR", 60000, 27),
                new Employee(6, "Sneha", "Finance", 95000, 40),
                new Employee(7, "Vikas", "IT", 72000, 29),
                new Employee(8, "Pooja", "HR", 67000, 31),
                new Employee(9, "Rohit", "Finance", 88000, 36),
                new Employee(10, "Kavita", "IT", 99000, 45),
                new Employee(11, "Arjun", "HR", 61000, 26),
                new Employee(12, "Meena", "Finance", 87000, 38),
                new Employee(13, "Suresh", "IT", 71000, 33),
                new Employee(14, "Nikita", "HR", 65000, 28),
                new Employee(15, "Deepak", "Finance", 92000, 41),
                new Employee(16, "Neha", "IT", 78000, 34),
                new Employee(17, "Manish", "HR", 69000, 37),
                new Employee(18, "Alok", "Finance", 97000, 42),
                new Employee(19, "Swati", "IT", 83000, 31),
                new Employee(20, "Karan", "HR", 64000, 29)
        );
    }
    public static List<Employee> getEmployees2() {
        return Arrays.asList(
            new Employee(1, "Alice", "IT", 75000, 29, LocalDate.of(2025, 3, 15)),
            new Employee(2, "Bob", "Finance", 90000, 35, LocalDate.of(2022, 7, 10)),
            new Employee(3, "Charlie", "HR", 60000, 41, LocalDate.of(2018, 1, 5)),
            new Employee(4, "David", "IT", 85000, 38, LocalDate.of(2020, 11, 20)),
            new Employee(5, "Eve", "Finance", 95000, 28, LocalDate.of(2024, 9, 1)),
            new Employee(6, "Frank", "HR", 58000, 25, LocalDate.of(2025, 5, 12)),
            new Employee(7, "Grace", "Marketing", 72000, 32, LocalDate.of(2023, 4, 18)),
            new Employee(8, "Hank", "Marketing", 68000, 45, LocalDate.of(2019, 6, 30)),
            new Employee(9, "Ivy", "IT", 80000, 27, LocalDate.of(2021, 8, 25)),
            new Employee(10, "Jack", "Finance", 99000, 50, LocalDate.of(2015, 2, 14))
        );
    }
}

