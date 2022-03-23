package fr.fms.entities;
/**
 * @author Stagiaires09
 *
 */
public class Capital extends City{
	private String monument;
	/**
	 * @param name
	 * @param state
	 * @param population
	 */
	public Capital(String name, String state, int population, String monument) {
		super(name, state, population);
		setMonument(monument);
	}
	/**
	 * @return the monument
	 */
	public String getMonument() {
		return monument;
	}
	/**
	 * @param monument the monument to set
	 */
	public void setMonument(String monument) {
		this.monument = monument;
	}
	@Override
	public String toString() {
		
		return super.toString() + ", monument :" + monument;
		
	}
	
}
