package fr.diginamic.builder;

public class Produit {
	protected String nom;
	protected String grade;
	protected Catégorie catégorie;
	protected Additif Additif;
	protected Marque marque;
	protected Ingredient ingredient;
	protected Allergene allergene;

	
	public String getNom() {
		return nom;
	}

	public String getGrade() {
		return grade;
	}

	public Catégorie getCatégorie() {
		return catégorie;
	}

	public Additif getAdditif() {
		return Additif;
	}

	public Marque getMarque() {
		return marque;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public Allergene getAllergene() {
		return allergene;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setCatégorie(Catégorie catégorie) {
		this.catégorie = catégorie;
	}

	public void setAdditif(Additif additif) {
		Additif = additif;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public void setAllergene(Allergene allergene) {
		this.allergene = allergene;
	}

}
