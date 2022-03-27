/**
 * 
 */
package fr.fms.entities;

/**
 * @author Stagiaires09
 *
 */
/**
 * @author Stagiaires09
 *
 */
public class Employee extends Person{
	private String company;
	private double salary;
	public static final double minSalary = 1269.0;
	public static final double averageGharges =20.0;
	/**
	 * @param lastName
	 * @param firstName
	 * @param age
	 * @param address
	 * @param Born
	 * @param company
	 * @param salary
	 */
	public Employee(String lastName, String firstName, int age, String address, City Born, String company, double salary) {
		super(lastName, firstName, age, address, Born);
		setCompany(company);
		setSalary(salary);		
	}
	 /** @param lastName
	 * @param firstName
	 * @param age
	 * @param address
	 * @param Born
	 * @param company	 * 
	 */
	public Employee(String lastName, String firstName, int age, String address, City Born, String company) {
		super(lastName, firstName, age, address, Born);
		setCompany(company);
		setSalary(minSalary);
	}
	
	@Override
	public double remuneration() {
		return salary*(1-averageGharges/100);
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
		if(salary < 1269.0) { 
			System.out.println("Un salaire ne peut être inférieur au SMIC");
		}else{
			this.salary = salary;
		}		
	}		
	@Override
	public String toString() {
		return super.toString() + ", Entreprise : " + company + ", salaire : " + salary;
		
	}
	
}
