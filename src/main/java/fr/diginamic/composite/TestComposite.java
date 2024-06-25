package fr.diginamic.composite;

public class TestComposite {

	public static void main(String[] args) {
		
		Employe chefService1 = new Employe("GUINEAU", "Kevin", 7500.0);
		Employe leadDev = new Employe("MARTIN", "Paul", 3500.0);
		Employe chefService2 = new Employe("RANMEY", "JB", 7500.0);
		Employe concepteur = new Employe("DOE", "Jane", 3500.0);
		Employe directeur = new Employe("RASPEY", "Cécile", 10000.0);
		Employe architecte = new Employe("BECHKAR", "Bilel", 8000.0);
		
		Service javaDev = new Service("Java Dev");
		Service bigData = new Service("Big Data");
		Service dsin = new Service("DSIN");
		
		

	}

}
