package fr.diginamic.builder;

public class Allergene {
	protected String nom;
	protected Double qteMilligrammes;

	public String getNom() {
		return nom;
	}

	public Allergene(String nom, Double qteMilligrammes) {
		super();
		this.nom = nom;
		this.qteMilligrammes = qteMilligrammes;
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
