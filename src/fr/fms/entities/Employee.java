/**
 * 
 */
package fr.fms.entities;

/**
 * @author Stagiaires09
 *
 */
public class Employee extends Person{
	private String company;
	private double salary;
	/**
	 * @param lastName
	 * @param firstName
	 * @param age
	 * @param address
	 * @param Born
	 */
	public Employee(String lastName, String firstName, int age, String address, City Born, String company, double salary) {
		super(lastName, firstName, age, address, Born);
		setCompany(company);
		setSalary(salary);
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}		
	@Override
	public String toString() {
		return super.toString() + ", Entreprise : " + company + ", salaire : " + salary;
		
	}
}
