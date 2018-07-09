package weekThreeHomework;
import java.util.Scanner;

	public class RefactoredApp {
		static Scanner sc = new Scanner(System.in); //allows user input - global scope
		static String userName = "";
		
		public static void main(String[] args) {
			int decision = 0;
			
			//the application exits if the user picks 5
			while (decision != 5) {
				printMenu();
				decision = sc.nextInt();
			
				if (decision >= 6 || decision <= 0) {
					followInstructions();
					
				} else if (decision == 1) {
					userName = getUserName();
					checkUserName();
					
				} else if (decision == 2) {
					pickYesOrNo();
					
				} else if (decision == 3) {
					playGame();
					
				} else if (decision == 4) {
					pickFour();
			    }
			}
			
			System.out.println("Goodbye!");	
		}
		
		public static void pickFour() {
			if (!userName.equals("")) {
				System.out.println("I'm tired of picking options. Pick option 5 already!");
		  
			} else {
		    	System.out.println("Have you played the number game yet?");
		    }
		}
		
		public static void playGame() {
			int num = 0;
			while (num != 1) {
				//game runs until user picks 0
			System.out.print("Pick a number between 0 and 5: ");
			num = sc.nextInt();
				
			if (num > -1 && num <= 5) {
				System.out.println("You picked: " + num);
			}
		}
			System.out.println("The number game is over!");
		
		}
		
		public static void pickYesOrNo() {
			System.out.print("Pick yes or no: ");
			String yes = sc.next();
			
			if (yes.equals("Yes")) {
				System.out.println("Will, Mom says no!");
			
			} else {
				System.out.println("But Yes is my favorite answer!");
			}
		}
		
		public static void followInstructions() {
			System.out.println("Please FOLLOW THE INSTRUCTIONS!");
		}
		
		public static String getUserName() {
			System.out.print("Enter user name: ");
			return sc.next();
			
		}
		
		public static void checkUserName() {
			if(userName.equals("Will")) {
				System.out.println("Whatcha doin' Will?");
			} else {
				System.out.println("Welcome " + userName + "!");
			}
			
		}
		public static void printMenu() {
			System.out.println("1) Create a Username");
			System.out.println("2) Pick Yes or No");
			System.out.println("3) Play a number game");
			System.out.println("4) Option 4");
			System.out.println("5) Exit");
			System.out.print("Pick an option: " );
		}
		
}




