/**
 * 
 */
package fr.fms.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Stagiaires09
 *
 */
public class TestPersons {
	//Exercice 3.2
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Capital paris = new Capital("Paris" , "France" ,2000000 , "Tour Eiffel");
		Capital dakar = new Capital("Dakar" , "Sénégal" ,1056009 , "Gorée");
		Capital washington = new Capital("Washington" , "USA" ,1056009 , "W-M");
		
		Person[] persons = new Person[8];
		persons[0] = new Employee("Sarkozy","Nicolas",66,"Paris", paris,"CAC-40" ,22.0);
		persons[1] = new Employee("N'doure","Youssou",62,"Ngor", dakar,"Gouvernement Mbaye", 24000.0);
		persons[2] = new Employee("Depardieu","Gerard",72,"Moscou", new City("Châteauxroux","France"),"Cote du Rhone", 85000.0);
		persons[3] = new Employee("Gate","Bill",65,"USA", washington,"Fondation B&M", 7600000.0);
		persons[4] = new Employee("Musk","Elon",49,"pao alto", new City("Pretoria","Afrique du Sud", 800000),"Tesla", 150000.0);
		persons[5] = new Employee("N'doure","Youssou",62,"Ngor", dakar,"Gouvernement Mbaye", 24000.0);
		persons[6] = new Commercial("Dupon","Robert",50,"rue des rosier Toulouse", new City("Limoge","France"),"Brico", 5.0);
		persons[7] = new Commercial("Macron","Emmanuel",43,"Elysee à Paris", new City("Amiens","France", 100), "MEDEF" , 0.1);
		
		
		ArrayList<Object> personsList = new ArrayList(Arrays.asList(persons));
			
		
				for(Person P : persons) System.out.println(P);

		
		
		
	}
}
