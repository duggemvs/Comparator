package com.java.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employe> emp = new ArrayList<>();
		emp.add(new Employe(24,"Roy", 9.42,"Hyderabad"));
		emp.add(new Employe(42,"smith", 12.22,"Delhi"));
		emp.add(new Employe(23,"kin", 32.62,"Mumbai"));
		emp.add(new Employe(20,"Don", 19.2,"Hyderabad"));
		emp.add(new Employe(31,"Gorge", 29.2,"Bangalore"));
		emp.add(new Employe(21,"Gorge", 29.2,"Bangalore"));
		
		
		/* Sorting the employees by Name */
		emp.sort(Comparator.comparing(Employe :: getName));
		System.out.println("Comparing by name ");
		emp.forEach(s->System.out.println(s));
		
		/* Sorting the employees by Age */
		emp.sort(Comparator.comparingInt(Employe :: getAge));
		System.out.println("Comparing by Age ");
		emp.forEach(s->System.out.println(s));
		
		/* Sorting the employees by Salary */
		emp.sort(Comparator.comparingDouble(Employe :: getSalary));
		System.out.println("Comparing by Salary ");
		emp.forEach(s->System.out.println(s));
		
		/* Sorting the employees by Name and age */
		emp.sort(Comparator.comparing(Employe :: getName).thenComparingInt(Employe :: getAge));
		System.out.println("Comparing by Name and then age ");
		emp.forEach(s->System.out.println(s));

	}

}
