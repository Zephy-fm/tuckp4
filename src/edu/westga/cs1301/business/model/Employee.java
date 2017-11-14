package edu.westga.cs1301.business.model;
/** Store basic information for an Employee
 * 
 * @author Tucker Yazdani
 *
 */
public class Employee {
	private String name;
	private int yearOfHire;
	private String jobTitle;
	private double hourlyWage;
	private int rating;
	
	private static final double MINIMUM_WAGE = 7.25;
	
	private String getName() {
		return this.name;
	}
	
	private int getYear() {
		return this.yearOfHire;
	}
	
	/** Creates a default Employee
	 * 
	 * @precondition none
	 * @postcondition 
	 * 
	 */
	public Employee() {
		this.name = "James";
		this.yearOfHire = 1970;
		this.jobTitle = "Janitor";
		this.hourlyWage = MINIMUM_WAGE;
		this.rating = 1;
	} 
	
	/**
	 * 
	 * @param name cannot be null and cannot be empty string
	 * @param yearOfHire must be >= 1970
	 * @param jobTitle cannot be null
	 * @param hourlyWage >= MIN_WAGE
	 * @param rating must be between 1 to 5
	 */
	public Employee(String name, int yearOfHire, String jobTitle, double hourlyWage, int rating ) {
		/// add name
		/// add job title both cannot be null or empty
		if (name == null) {
			throw new IllegalArgumentException("name cannot be null");
		}
		if (jobTitle == null) {
			throw new IllegalArgumentException("jobTitle cannot be null");
		}
		if ( name.equals("")) {
			throw new IllegalArgumentException("name cannot be empty");
		}
		if (jobTitle.equals("")) {
			throw new IllegalArgumentException("jobTitle cannot be empty");
		}
	}
				
	
	
	
	
}