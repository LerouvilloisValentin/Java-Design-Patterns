package fr.diginamic.builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProduitBuilderTest {

	@Test
	public void testProduit() {
		Produit produit = new ProduitBuilder()
                .appendNom("Produit1")
                .appendGrade("A")
                .appendCatégorie("Catégorie1")
                .appendAdditif("Additif1", 50.0)
                .appendAllergene("Allergene1", 10.0)
                .appendIngredient("Ingredient1", 100.0)
                .appendMarque("Marque1")
                .build();

        assertNotNull(produit);
        assertEquals("Produit1", produit.getNom());
        assertEquals("A",produit.getGrade());
        assertNotNull(produit.getCatégorie());
        assertEquals("Catégorie1",produit.getCatégorie().getNom());
        assertNotNull(produit.getAdditif());
        assertEquals("Additif1",produit.getAdditif().getNom());
        assertEquals(50.0,produit.getAdditif().qteMilligrammes,0.0001);
        assertNotNull(produit.getAllergene());
        assertEquals("Allergene1", produit.getAllergene().getNom());
        assertEquals(10.0, produit.getAllergene().getQteMilligrammes(), 0.001);
        assertNotNull(produit.getIngredient());
        assertEquals("Ingredient1", produit.getIngredient().getNom());
        assertEquals(100.0, produit.getIngredient().getQteMilligrammes(), 0.001);
        assertNotNull(produit.getMarque());
        assertEquals("Marque1", produit.getMarque().getNom());
	}

}
