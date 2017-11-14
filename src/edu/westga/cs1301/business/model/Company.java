package edu.westga.cs1301.business.model;

import java.util.ArrayList;

public class Company {
	private String name;
	private ArrayList<Employee> employees;
	
	public int size() {
		return this.employees.size();
	}

	public Company(String name) {
		if (name == null) {
			throw new IllegalArgumentException("name cannot be null");
		}
		if (name.equals("")) {
			throw new IllegalArgumentException("name cannot be empty");
		}
		this.name = name;
		this.employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee theEmployee) {
		if (theEmployee == null) {
			throw new IllegalArgumentException("theEmployee cannot be null");
		}
		this.employees.add(theEmployee);
	}
	
	public Employee getEmployee(int index) {
		int employeeCount = this.employees.size();
		if (employeeCount == 0) {
			return null;
		}
		if (index < 0) {
			throw new IllegalArgumentException("index cannot be less than 0");
		}
		if (index >= employeeCount) {
			throw new IllegalArgumentException("index is out of bounds of the employee count");
		}
		return this.employees.get(index);
	}
	
	public double getAverageHourlyWage() {
		int employeeCount = this.employees.size();
		double totalHourlyWage = 0.00;
		for (Employee current : this.employees) {
			totalHourlyWage += current.getHourlyWage();
		}
		return totalHourlyWage / employeeCount;
	}
	
	public int getEarliestYearOfHire() {
		int earliestYear = 1970;
		if (this.employees.size() == 0) {
			return earliestYear;
		}
		earliestYear = Integer.MAX_VALUE;
		for (Employee current : this.employees) {
			if (current.getYear() < earliestYear) {
				earliestYear = current.getYear();
			}
		}
		return earliestYear;
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Employee> getEmployees() {
		return this.employees;
	}

}
