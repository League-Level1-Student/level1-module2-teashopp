package _99_extra;

import java.util.Random;

public class PixelPartyRunner {

	public static void main(String[] args) {
		
		PixelParty pipa = new PixelParty();
		
		pipa.setColor(0, 0, 225);		
		pipa.drawRectangle(0, 0, 100, 100);
		pipa.drawCircle(0, 0, 50);
		pipa.drawRectangle(0, 0, 100, 100);
		
		pipa.saveImage();
		pipa.displayImage();
		
	}
	
}
