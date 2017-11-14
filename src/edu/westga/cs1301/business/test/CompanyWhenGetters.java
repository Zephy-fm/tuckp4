package edu.westga.cs1301.business.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import edu.westga.cs1301.business.model.Company;
import edu.westga.cs1301.business.model.Employee;

public class CompanyWhenGetters {

	@Test
	public void testGetName() {
		Company company1 = new Company("Google");
		
		assertEquals("Google", company1.getName());
	}

	@Test
	public void testGetEmployees() {
		Company company1 = new Company("Google");
		ArrayList<Employee> expectedArrayList = new ArrayList<Employee>();
		
		assertEquals(expectedArrayList, company1.getEmployees());
	}

}
