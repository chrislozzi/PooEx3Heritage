package fr.fms.entities;

/**
 * @author Stagiaires09
 *
 */
public abstract class Person {
	private String lastName;	//Nom de la personne
	private String firstName;	//prénom de la personne
	private int age; //Age de la personne
	private String address; //Lieux de résidence
	private City Born; //Ville de naissance
	public static final int MIN_AGE = 0;
	
	/**Constructeur dune instance de class Person avec tous les paramètre renseigné
	 * @param lastName
	 * @param firstName
	 * @param age
	 * @param address
	 */
	public Person(String lastName, String firstName, int age, String address, City Born) {
		setLastName(lastName);
		setFirstName(firstName);
		setAge(age);
		setAddress(address);
		setBorn(Born);
		
	}
	
	/**Constructeur d'une instance de class Person avec les champs Address et ville de naissance 
	 * définis par défaut, soit respectivement:"unknow" et "null"
	 * @param lastName
	 * @param firstName
	 * @param age
	 */
	public Person(String lastName, String firstName, int age) {
		setLastName(lastName);
		setFirstName(firstName);
		setAge(age);
		setAddress("unkown"); //valeur par défaut
		setBorn(null);
		
	}

	/**Constructeur d'une instance de class Person avec les champs age, adress et ville de naissance 
	 * définis par défaut, soit respectivement: 0 ,"unknow" et "null"
	 * @param lastName
	 * @param firstName
	 */
	public Person(String lastName, String firstName) {
		setLastName(lastName);
		setFirstName(firstName);
		setAge(MIN_AGE);
		setAddress("unkown");
		setBorn(null);
	}
	
	/**
	 * @return remuneration
	 */
	public abstract double remuneration();
	
	
	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 0) 
			throw new RuntimeException("L'age ne peut être négatif !");
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
		

	/**
	 * @return the born
	 */
	public City getBorn() {
		
		return Born;
	}

	/**
	 * @param born the born to set
	 */
	public void setBorn(City born) {
		Born = born;	
		
	}
	
	
	
	/*public String toString() { 
		  if(Born != null)
		 return  this.getClass().getTypeName() + " [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age +", address=" +  address + "]" + 
				 									"Born" +Born.getClass().getTypeName() + Born.toString();
		  else return this.getClass().getTypeName() + " [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age +", address=" +  address + "]" + 
			"BornNull";
		
	  }*/

	@Override
	public String toString() { 
		
		  if(Born != null) {
			  if(Born.getPopulation()!=0) {
		 return  lastName + ", " + firstName +", " + age +"ans" + ", habitant à " + address +", ville de maissance : " + 
				  Born.getName() +", " + Born.getstate();
			  }else {
				  return  lastName + ", " + firstName +", " + age +"ans" + ", " + address +", ville de maissance : " + 
						  Born.getName() +"," +Born.getstate(); 
			  }
		  }else { return this.getClass().getTypeName() + " [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age +", address=" +  address + "]" + 
			"BornNull";		
	  }
	
	}
	
}
