/**
 * 
 */
package fr.fms.entities;

/**
 * @author Stagiaires09
 *
 */

  public class Commercial extends Employee{
	  private double profitSharing;
	  public static final double minProfitSharing = 0.1;
	  public static final double turnover = 50000;
	/**
	 * @param lastName
	 * @param firstName
	 * @param age
	 * @param address
	 * @param Born
	 * @param company
	 * @param profitSharing
	 */
	public Commercial(String lastName, String firstName, int age, String address, City Born, String company, double profitSharing) {
		super(lastName, firstName, age, address, Born, company);
		setProfitSharing(profitSharing);
	}
		
	/**
	 * @param lastName
	 * @param firstName
	 * @param age
	 * @param address
	 * @param Born
	 * @param company
	 */
	public Commercial(String lastName, String firstName, int age, String address, City Born, String company) {
		super(lastName, firstName, age, address, Born, company);
		setProfitSharing(minProfitSharing);
	}
	
	
	@Override
	public double remuneration() {
		return turnover*profitSharing/100;
	}
	/**
	 * @return the profitSharing
	 */
	public double getProfitSharing() {
		return profitSharing;
	}
	/**
	 * @param profitSharing the profitSharing to set
	 */
	public void setProfitSharing(double profitSharing) {
		if(profitSharing < 0) { 
			System.out.println("L'intéressement ne peut être négatif");			 ;
		}else { 
			this.profitSharing = profitSharing;
		}
	}
	@Override
	public String toString() {
		//Exercice 3.6
//		return super.toString() + " % CA : " + profitSharing;
		//Exercice 3.8
		return super.toString();
	}
  
	  
	  
	  
	  
  
  }
 