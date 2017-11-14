package edu.westga.cs1301.business.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs1301.business.model.Employee;

public class employee {

	@Test
	public void test() {
		Employee john = new Employee();
		assertEquals("James, 1970, Janitor", john.toString());
	}

}
