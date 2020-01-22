package Factory;

public class PYCCake extends Cake {

	//Gets ingredient factory
	IngrediantFactory factory;
	
	public PYCCake(IngrediantFactory factory) {
		this.factory = factory;
	}
	
	//sets ingredients from factory.
	void prepare() {
		System.out.println("Preparing " + name);
		batter = factory.createYellowBatter();
		icing = factory.createChocolateIcing();
		decorations = factory.createPlaneDecorations();

	}

}
