package edu.westga.cs1301.business.test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import edu.westga.cs1301.business.model.Company;

public class CompanyWhenConstructor {
	
	@Rule 
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testValidName() {
		Company company1 = new Company("Google");
		
		assertEquals("Google", company1.getName());
	}

	@Test
	public void testNullName() {
		exception.expect(IllegalArgumentException.class);
		Company company1 = new Company(null);
	}

	@Test
	public void testEmptyName() {
		exception.expect(IllegalArgumentException.class);
		Company company1 = new Company("");
	}

}
