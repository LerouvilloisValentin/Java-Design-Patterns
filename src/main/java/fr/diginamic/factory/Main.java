package fr.diginamic.factory;

public class Main {
    public static void main(String[] args) {
        Element ingredient = FactoryElement.creerElement(EnumFactory.INGREDIENT, "Tomate", 100, "grammes");
        Element allergene = FactoryElement.creerElement(EnumFactory.ALLERGENE, "Gluten", 10, "milligrammes");
        Element additif = FactoryElement.creerElement(EnumFactory.ADDITIF, "Add", 5, "milligrammes");

        System.out.println("Ingredient: " + ingredient.nom + ", " + ingredient.valeur + " " + ingredient.unite);
        System.out.println("Allergene: " + allergene.nom + ", " + allergene.valeur + " " + allergene.unite);
        System.out.println("Additif: " + additif.nom + ", " + additif.valeur + " " + additif.unite);
    }
}
