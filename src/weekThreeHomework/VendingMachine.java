package weekThreeHomework;

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println(vend(1.75, "C2"));
	}
	
	/*
	 * Write a vend method that takes double currency and String selection
	 * and returns a different String (candy) for different selections
	 * validate the currency is sufficient to purchase the candybar, 
	 * otherwise, return the money with a meaningful message.
	 */
		
	
	public static String vend(double price, String selection) {
		if (price >= 1.50 && selection == "A4") {
			return "You've choosen a Snickers!";
		} else if (price >= 1.20 && selection == "B2"){
			return "You can't go wrong with a KitKat.";
		} else if (price <= 1.00) {
			return "You need more $$!";
		} else {
			return "Try again with a different selection.";
		}	

   }


}
