package fr.fms.entities;

public class Test {

	public static void main(String[] args) {
		Capital paris = new Capital("Paris" , "France" ,2000000 , "Tour Eiffel");
		Capital london = new Capital("Londres" , "GB" ,94000000 , "Bigben");
		Capital dakar = new Capital("Dakar" , "Sénégal" ,1056009 , "Gorée");
		Capital washington = new Capital("Washington" , "USA" ,1056009 , "W-M");
		
		
		
		Employee sarko = new Employee("Sarkozy","Nicolas",66,"Paris", paris,"Fort boyard" ,2204.0);
		Employee youssou = new Employee("N'doure","Youssou",62,"Ngor", dakar,"Gouvernement Mbaye", 240000.0);
		Employee gege = new Employee("Depardieu","Gerard",72,"Moscou", new City("Châteauxroux","France"),"Cote du Rhone", 85000.0);
		Employee biloute = new Employee("Gate","Bill",65,"USA", new City("Washington","USA"),"Fondation B&M", 100000.0);
		Employee nikolas = new Employee("Musk","Elon",49,"pao alto", new City("Pretoria","Afrique du Sud", 800000),"Fondation B&M", 150000.0);
		
		Commercial ponpon =new Commercial("Dupon","Robert",50,"rue des rosier Toulouse", new City("Limoge","France"),"Brico", 5.0);
		Commercial batman = new Commercial("Bruce","Wayne",40,"Ghottam", new City("Ghottam","USA"), "Justice Society of America" , 50.0);
		Commercial manu = new Commercial("Macron","Emmanuel",43,"Elysee à Paris", new City("Amiens","France", 100), "Zavata" , 0.5);
		
		
		System.out.println(manu);
		System.out.println(batman);
		System.out.println(sarko);
		System.out.println(youssou);
		System.out.println(gege);
		System.out.println(biloute);
		
		System.out.println(ponpon);
		ponpon.setProfitSharing(-1.0);
		sarko.setSalary(1.0);
		
		System.out.println(manu.remuneration());
		System.out.println(biloute.remuneration());
		System.out.println(ponpon.remuneration());
		System.out.println(nikolas.remuneration());
	}

}
