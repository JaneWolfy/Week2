package Factory;

public class DCBCake extends Cake {

	//Gets ingredient factory
	IngrediantFactory factory;
	
	public DCBCake(IngrediantFactory factory) {
		this.factory = factory;
	}
	
	//sets ingredients from factory.
	void prepare() {
		System.out.println("Preparing " + name);
		batter = factory.createChocolateBatter();
		icing = factory.createChocolateIcing();
		decorations = factory.createBirthdayDecorations();

	}

}
