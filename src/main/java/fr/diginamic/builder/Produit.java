package fr.diginamic.builder;

import java.util.List;

public class Produit {
	protected String nom;
	protected String grade;
	protected Catégorie catégorie;
	protected Marque marque;
	protected List<Additif> Additifs;
	protected List<Ingredient> ingredients;
	protected List<Allergene> allergenes;
	public String getNom() {
		return nom;
	}
	public String getGrade() {
		return grade;
	}
	public Catégorie getCatégorie() {
		return catégorie;
	}
	public Marque getMarque() {
		return marque;
	}
	public List<Additif> getAdditifs() {
		return Additifs;
	}
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public List<Allergene> getAllergenes() {
		return allergenes;
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
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	public void setAdditifs(List<Additif> additifs) {
		Additifs = additifs;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public void setAllergenes(List<Allergene> allergenes) {
		this.allergenes = allergenes;
	}

	


}
