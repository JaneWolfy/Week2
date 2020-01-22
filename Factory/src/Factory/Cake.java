package Factory;

public abstract class Cake {
	
	//Creates the name for the cake
	String name;
	
	
	Batter batter;				//Creates batter for the cake
	Icing icing;				//Creates the icing for the cake
	Decorations decorations;	//Creates the decorations for the cake
	
	abstract void prepare();
	
	//Prints out the pouring of batter and what type of batter
	void pourBatter() {
		System.out.println("Pour " + batter + " batter into tin.");
	}
	
	//Prints out the baking of the batter and type of batter	
	void bake() {
		System.out.println("Bake " + batter + " cake batter at 350 for 35 minutes.");
	}
	
	//Prints out the cooling process and type of cake
	void cool() {
		System.out.println("Let " + batter + " cake cool to room temp.");
	}
	
	//Prints out the cake type and the icing type for the process
	void ice() {
		System.out.println("Ice " + batter + " cake with " + icing + " icing.");
	}
	
	//Prints out the decoration of the named cake and decoration
	void decorate() {
		System.out.println("Decorate " + name + " with " + decorations);
	}
	
	//prints out the boxing of the cake
	void box() {
		System.out.println("Gently place " + name + " in box");
	}
	
	//Allows cake name to be set
	void setName(String name) {
		this.name = name;
	}
	
	//Allows cake name to be retrieved
	public String getName() {
		return name;
	}
}
