package fr.diginamic.factory;

public abstract class Element {

	protected String nom;
    protected double valeur;
    protected String unite;
    
	public Element(String nom, double valeur, String unite) {
		super();
		this.nom = nom;
		this.valeur = valeur;
		this.unite = unite;
	}

	
	
}
