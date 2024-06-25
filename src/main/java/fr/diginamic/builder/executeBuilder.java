package fr.diginamic.builder;

public class executeBuilder {

	public static void main(String[] args) {
	     // Création d'un produit en utilisant le builder de manière fluide
        Produit produit = new ProduitBuilder()
                .appendNom("Produit1")
                .appendGrade("A")
                .appendCatégorie("Catégorie1")
                .appendAdditif("Additif1", 50.0)
                .appendAllergene("Allergene1", 10.0)
                .appendIngredient("Ingredient1", 100.0)
                .appendMarque("Marque1")
                .build();
	}

}
