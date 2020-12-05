package _99_extra;

import javax.swing.JOptionPane;

public class MasterOfMethods {

	public static void main(String[] args) {

		// asking mom for money //

		boolean isInAGoodMood = false;
		int askForMoney = 20;

		if (isInAGoodMood()) {
			askForMoney(20);
		}

		else {
			JOptionPane.showMessageDialog(null, "She seems to be in a bad mood, ask later");
		}

	}

	private static void askForMoney(int i) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Can I have $20?");
	}

	private static boolean isInAGoodMood() {
		// TODO Auto-generated method stub
		return true;
	}

}

