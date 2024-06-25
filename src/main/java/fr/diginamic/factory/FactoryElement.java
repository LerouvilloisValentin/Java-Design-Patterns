package fr.diginamic.factory;

public class FactoryElement {
    public static Element creerElement(EnumFactory type, String nom, double valeur, String unite) {
        switch (type) {
            case INGREDIENT:
                return new Ingredient(nom, valeur, unite);
            case ALLERGENE:
                return new Allergene(nom, valeur, unite);
            case ADDITIF:
                return new Additif(nom, valeur, unite);
            default:
                throw new IllegalArgumentException("Type d'élément inconnu : " + type);
        }
    }
}
