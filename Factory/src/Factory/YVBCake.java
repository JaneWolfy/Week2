package Factory;

public class YVBCake extends Cake {

	//Gets ingredient factory
	IngrediantFactory factory;
	
	public YVBCake(IngrediantFactory factory) {
		this.factory = factory;
	}
	
	//sets ingredients from factory.
	void prepare() {
		System.out.println("Preparing " + name);
		batter = factory.createYellowBatter();
		icing = factory.createVanillaIcing();
		decorations = factory.createBirthdayDecorations();

	}
}
