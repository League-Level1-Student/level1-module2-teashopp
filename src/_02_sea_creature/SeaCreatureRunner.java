package _02_sea_creature;

public class SeaCreatureRunner {
	
	public static void main(String[] args) {
		
		SeaCreature SpongeBob = new SeaCreature("SpongeBob");
		SeaCreature Patrick = new SeaCreature("Patrick");
		
		SpongeBob.getName();
		Patrick.getName();
		
		SpongeBob.eat();
		Patrick.eat();
		
		SpongeBob.laugh();
		Patrick.laugh();
		
	}

}
