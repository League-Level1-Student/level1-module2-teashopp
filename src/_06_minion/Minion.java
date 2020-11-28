package _06_minion;

public class Minion {

	private String name;
	private int eyes;
	private String color;
	private String master;
	
	public Minion(String name, int eyes, String color, String master) {
		
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
		
	}
	
	String getName(){
		return(name);	
	}
	
	int getEyes() {
		return(eyes);
	}
	
	String getColor() {
		return(color);
	}
	
	String setMaster(String master) {
		return(master);
	}
	
	String getMaster() {
		return(master);
	}

}
