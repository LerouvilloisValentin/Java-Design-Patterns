package fr.diginamic.builder;

public class Additif {
	protected String nom;
	protected Double qteMilligrammes;

	public Additif(String nom, Double qteMilligrammes) {
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
