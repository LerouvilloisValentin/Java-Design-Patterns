package fr.diginamic.builder;

public class Ingredient {
	protected String nom;
	protected Double qteMilligrammes;

	public Ingredient(String nom, Double qteMilligrammes) {
		super();
		this.nom = nom;
		this.qteMilligrammes = qteMilligrammes;
	}

	public String getNom() {
		return nom;
	}

	public Double getQteMilligrammes() {
		return qteMilligrammes;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setQteMilligrammes(Double qteMilligrammes) {
		this.qteMilligrammes = qteMilligrammes;
	}

}
