package _99_extra;

public class CandyBuyer {
	
	public static void main(String[] args) {
		
		CandyFriend jimmy = new CandyFriend();
		CandyShop sweets = new CandyShop();
		
		sweets.buy(jimmy.getFavoriteCandy());
		
	}

}
