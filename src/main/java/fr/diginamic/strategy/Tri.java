package fr.diginamic.strategy;

public class Tri {

    public void exec(TypeTri typeTri, Integer[] array) {
        Strategy strategy = StrategyFactory.getStrategy(typeTri);
        strategy.trier(array);
    }
}
