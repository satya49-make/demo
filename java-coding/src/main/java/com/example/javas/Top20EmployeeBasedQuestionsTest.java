package com.example.javas;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.javas.code.Employee;

public class Top20EmployeeBasedQuestionsTest {

	public static void main(String[] args) {
//		MOST ASKED REAL-TIME JAVA 8 INTERVIEW QUESTIONS
	        List<Employee> lst=Employee.getEmployees();
//
//		1. Second Highest Salary Employee
	       // lst.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().ifPresent(System.out::println);
//		2. Nth Highest Salary Employee
	        //use same concept above
//		3. Highest Salary Department Wise
//	        Comparator<Employee> comp= Comparator.comparing(Employee::getSalary);
//	        lst.stream().collect(Collectors.groupingBy(e->e.getDepartment(),
//	        		Collectors.collectingAndThen(Collectors.maxBy(comp),Optional::get)))
//	        .entrySet().stream()
//	        //.sorted(Map.Entry.comparingByValue(comp.reversed())) // sort by salary descending
//	        .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue().getSalary()));
	        
//		4. Average Salary Department Wise
//	        Comparator<Employee> comp= Comparator.comparing(Employee::getSalary);
//	        lst.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.averagingDouble(Employee::getSalary)))
//	        .entrySet().stream()
//	        //.sorted(Map.Entry.comparingByValue(comp.reversed())) // sort by salary descending
//	        .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
//		5. Employee Count Department Wise
//	        lst.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
//	        .entrySet().forEach(System.out::println);
	        
//		6. Employee Count Gender Wise
//	        lst.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
//	        .entrySet().forEach(System.out::println);
	        
//		7. Duplicate Employee Names
//	        lst.stream().map(e->e.getName()).collect(Collectors.groupingBy(e->e,Collectors.counting())).entrySet()
//	        .forEach(System.out::println);
//		8. Duplicate Employee IDs
//	        lst.stream().map(e->e.getId()).collect(Collectors.groupingBy(e->e,Collectors.counting())).entrySet()
//	        .forEach(System.out::println);
//		9. Top 3 Salaries
	        //lst.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(4).forEach(System.out::println);
	        
//		10. Top 3 Employees
	        List<Employee> l2=Employee.getEmployees2();
//		11. Employees Joined Last Year
//	        l2.stream().filter(
//	        		e->{
//	        		LocalDate jd=	e.getJoiningDate();
//	        		return jd.isBefore(LocalDate.of(2025, 12, 31)) && jd.isAfter(LocalDate.of(2025, 1, 1));
//	        		
//	        		}).forEach(System.out::println);
	        		
//		12. Most Experienced Employee
	       // l2.stream().max(Comparator.comparing(Employee::getJoiningDate).reversed()).ifPresent(System.out::println);
//		13. Youngest Employee

	        //l2.stream().max(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
//		14. Oldest Employee
//		15. Department With Highest Average Salary
//	        lst.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
//	        .entrySet().stream().sorted(Map.Entry.<String,Double>comparingByValue().reversed()).forEach(System.out::println);
	        
//		16. Department With Maximum Employees
	        
//		17. Employees Above Average Salary
//	        double avgSalary = l2.stream()
//	        	    .mapToDouble(Employee::getSalary)
//	        	    .average()
//	        	    .orElse(0.0);
//
//	        	List<Employee> aboveAvg = l2.stream()
//	        	    .filter(e -> e.getSalary() > avgSalary)
//	        	    .toList();
//
//	        	System.out.println("Average Salary: " + avgSalary);
//	        	aboveAvg.forEach(System.out::println);

//		18. Salary Range Grouping
	        l2.stream()
	        .collect(Collectors.groupingBy(e -> {
	            if (e.getSalary() < 60000) return "<60k";
	            else if (e.getSalary() <= 80000) return "60k–80k";
	            else return ">80k";
	        })).entrySet().forEach(System.out::println);
//		19. Sort By Salary Then Name
//		20. Convert List<Employee> To Map
	     // Keyed by Name
	        
	        l2.stream().collect(Collectors.toMap(Employee::getName, e -> e)).entrySet().forEach(System.out::println);
	        l2.stream().collect(Collectors.groupingBy(Employee::getName)).entrySet().forEach(System.out::println);
	        

	}

}
