package Factory;

public class main {
	
	public static void main(String[] args) {
		//Creates bakery
		Bakery bakery = new Bakery();
		
		//orders cake
		bakery.orderCake("Double Chocolate Birthday Cake");
		
		bakery.orderCake("Yellow Vanilla Birthday Cake");
		
		bakery.orderCake("Plane Yellow Chocolate Cake");
	}
}
