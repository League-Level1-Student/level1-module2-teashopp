package _03_smurf;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		
		if(name.equalsIgnoreCase("Papa")) {
			System.out.println("Papa Smurf's hat is red!");
			return "red";
		}
		
		else {
			System.out.println(name + "'s hat is white!");
			return "white";
		}
		
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		
		if(name.equalsIgnoreCase("Smurfette")) {
			System.out.println("Smurfette is a girl!");
			return "girl";
		}
		
		else {
			System.out.println(name + " is a boy!");
			return "boy";
		}
	
	}

}


