package fr.diginamic.builder;

public class ProduitBuilder {
    private Produit produit;

    public ProduitBuilder() {
        produit = new Produit();
    }

    public ProduitBuilder appendNom(String nom) {
        produit.setNom(nom);
        return this;
    }

    public ProduitBuilder appendGrade(String grade) {
        produit.setGrade(grade);
        return this;
    }

    public ProduitBuilder appendCatégorie(String nom) {
        produit.setCatégorie(new Catégorie(nom));
        return this;
    }

    public ProduitBuilder appendAdditif(String nom, Double qteMilligrammes) {
        produit.setAdditif(new Additif(nom, qteMilligrammes));
        return this;
    }

    public ProduitBuilder appendAllergene(String nom, Double qteMilligrammes) {
        produit.setAllergene(new Allergene(nom, qteMilligrammes));
        return this;
    }

    public ProduitBuilder appendIngredient(String nom, Double qteMilligrammes) {
        produit.setIngredient(new Ingredient(nom, qteMilligrammes));
        return this;
    }

    public ProduitBuilder appendMarque(String nom) {
        produit.setMarque(new Marque(nom));
        return this;
    }
    
    public Produit build() {
        if (produit==null) {
        	return null;
        }
        return produit;
    }
}
