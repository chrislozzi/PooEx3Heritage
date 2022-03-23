package fr.fms.entities;

public class City {
	private String name; //Nom de la ville
	private String state; //Pays de la ville
	private int population; //Nombre d'habitant
	
	public static int instanceCount = 0; //compteur d'instance
	
	public final static int Min_Pupolation = 0;
	//constructeur (name,state,population)
	public  City(String name,String state,int population) {
		instanceCount++;		
		setName(name);
		setstate(state);
		if(population < 0) throw new RuntimeException("Le nombre d'habitant ne peut être négatif !"); 
		setPopulation(population);	
		
	}//constructeur (name,state,unknown)
	public  City(String name,int population) {
		instanceCount++;		
		setName(name);
		setstate("unknown");	
		setPopulation(population);
	}
		
	/**
	 * @param name
	 * @param state
	 */
	public City(String name, String state) {
		instanceCount++;
		setName(name);
		setstate(state);
		setPopulation(Min_Pupolation);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getstate() {
		return state;
	}


	public void setstate(String state) {
		this.state = state;
	}


	public int getPopulation() {		
		return population;
	}

	//Mutateur du nombre d'habitant reournant un exception si le paramètre en négatif
	public void setPopulation(int population) {
		
		  if(this.population> population) throw new  RuntimeException("Le nombre d'habitant ne peut pas diminuer");
		 
			this.population = population;

	}

	public String toString() {		
		return name +", "+ state +", "+ population +" d'habitants";
		}

	
	  public void displayCity() {
	  
	  System.out.format("City of %s in %s having %d inhabitants\n",this.name,
	  this.state, this.population); }
	 

	/*public String toString() {	 

		return "[city :" + name +"] [state : " +state + "] [number of inhabitants : " + population + "]";
	   }*/


}
