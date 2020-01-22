package Factory;

public class Bakery {
	
	public Cake orderCake(String item) {
		//Creates cake object
		Cake cake = null;
		
		//Creates Factory
		IngrediantFactory factory = new IngrediantFactory();
		
		//Identifies what type of cake is being made
		if (item.equals("Double Chocolate Birthday Cake")) {
			cake = new DCBCake(factory);
			cake.setName("Double Chocolate Birthday Cake");
		}
		else if (item.contentEquals("Yellow Vanilla Birthday Cake")) {
			cake = new YVBCake(factory);
			cake.setName("Yellow Vanilla Birthday Cake");
		}
		else if (item.contentEquals("Plane Yellow Chocolate Cake")) {
			cake = new PYCCake(factory);
			cake.setName("Plane Yellow Chocolate Cake");
		}
		//prints out cake making process.
		System.out.println("---Making a " + cake.getName() +"---");
		cake.prepare();
		cake.bake();
		cake.cool();
		cake.ice();
		cake.decorate();
		cake.box();
		System.out.println("\n");
		return cake;
				
	}
	
}
