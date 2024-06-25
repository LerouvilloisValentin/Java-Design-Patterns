package fr.diginamic.strategy;

public class StrategyFactory {

	public static Strategy getStrategy(TypeTri typeTri) {
		switch (typeTri) {
        case BUBBLE:
            return new Bubble();
        case INSERTION:
            return new Insertion();
        case SELECTION:
            return new Selection();
        default:
            throw new IllegalArgumentException("Type de tri inexistant.");
		}
	}
}
