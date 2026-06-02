package com.example.javas.code;

import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        List<Employee> empList=Employee.getEmployees();
//        //1. Find highest salary employee=>salary=99000.0
//        Comparator<Employee> salaryComparator= Comparator.comparingDouble(Employee::getSalary);
//        Employee emp=empList
//                .stream()
//                .max(salaryComparator).orElse(null);
//        System.out.println("Highest Salary Employee: "+emp);
		/*
		 * //2. Find employee with second highest salary =>salary=97000.0
		 * Comparator<Employee> salaryComparator=
		 * Comparator.comparingDouble(Employee::getSalary).reversed(); 
		 * Employee emp=empList .stream() .sorted(salaryComparator) .skip(1) .findFirst()
		 * .orElse(null); System.out.println("Second Highest Salary Employee: "+emp);
		 */
        
        //3.Highest Paid Employee per Department
//        Comparator<Employee> salaryComparator=
//       		  Comparator.comparingDouble(Employee::getSalary); 
//        Map<String, Employee> map=
//        		empList.stream()
//        		.collect(Collectors
//        				.groupingBy(Employee::getDepartment,
//        						Collectors
//        						.collectingAndThen(Collectors.maxBy(salaryComparator), Optional::get)));
//        System.out.println(map);
        
        //4. average salary per dept
//        Map<String, Double> avgSal=
//        		empList
//        		.stream()
//        		.collect(Collectors
//        				.groupingBy(Employee::getDepartment,
//        						Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(avgSal);
        
        //5. Employees Earning More Than Average Salary  
//        List<Employee> e=
//        		empList
//        		.stream()
//        		.filter(e1->{
//        			return e1.getSalary()> (empList.stream()
//        					.mapToDouble(Employee::getSalary)
//        					.average().orElse(0));
//        		}).toList();
//        System.out.println(e);
        
        //6. Count Employees by Department
//        empList.stream()
//        .collect(Collectors.groupingBy(Employee::getDepartment,
//        		Collectors.counting()))
//        .entrySet().forEach(System.out::println);
        
        //7. Youngest Employee in Each Department
//        empList.stream()
//        .collect(Collectors.groupingBy(Employee::getDepartment,
//        		Collectors.collectingAndThen(
//        				Collectors.minBy(Comparator.comparing(Employee::getAge)),
//        				Optional::get)))
//        .entrySet().forEach(System.out::println);
        
        //9. Sort Employees by Department → Salary → Name
//        empList.stream()
//        .sorted(Comparator.comparing(Employee::getDepartment)
//        		.thenComparing(Employee::getSalary).reversed())
//        		//.thenComparing(Employee::getName))
//        .toList().forEach(System.out::println);
        //11. Convert List to Map<Id, Name>
//        empList.stream()
//        .collect(Collectors.toMap(Employee::getId, e->e.getName())).entrySet()
//        .forEach(System.out::println);
        
        //12. Group Employees by Department (Names Only)
//        empList.stream()
//        .collect(Collectors.groupingBy(Employee::getDepartment,
//        		Collectors.mapping(Employee::getName,Collectors.toSet() )))
//        .entrySet().forEach(System.out::println);
        
        //16. Department Having Maximum Employees
//        String dept = empList.stream()
//            .collect(Collectors.groupingBy(
//                Employee::getDepartment,
//                Collectors.counting()
//            ))
//            .entrySet().stream()
//            .max(Map.Entry.comparingByValue())
//            .map(Map.Entry::getKey)
//            .orElseThrow();
        //17. Salary Statistics (Min, Max, Avg, Count)
//        DoubleSummaryStatistics stats = empList.stream()
//            .collect(Collectors.summarizingDouble(Employee::getSalary));
//        System.out.println(stats);
        // sort using comparator
        empList.forEach(System.out::println);
        System.out.println("=================");
        Collections.sort(empList, ( e1,  e2) -> e1.name.compareTo(e2.name));
        empList.forEach(System.out::println);


    }
}





















