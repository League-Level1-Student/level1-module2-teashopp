package _04_tea_maker;

import _04_tea_maker.Kettle.Water;

public class TeaMakerRunner {
	
	public static void main(String[] args) {
		
		TeaBag();
		Kettle();
		Cup();
		
		TeaBag tb = new TeaBag("Green");
		System.out.println(tb.getFlavor());
		
		Kettle kt = new Kettle();
		kt.boil();
		
		Cup cup = new Cup();
		cup.makeTea(tb, kt.getWater());
		
	}

	private static void Cup() {
		// TODO Auto-generated method stub
		
	}

	private static void Kettle() {
		// TODO Auto-generated method stub
		
	}


	private static void TeaBag() {
		// TODO Auto-generated method stub
		
	}

}
