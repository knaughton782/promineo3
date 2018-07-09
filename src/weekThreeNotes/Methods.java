package weekThreeNotes;

public class Methods {

	public static void main(String[] args) {

		/*Methods
		 * way to package up or modularize code to make reusable
		 * main is the entry method to your application
		 * methods are instructions, they don't actually execute instructions without being called
		 * 
		 * public static are access modifiers
		 * void is a return type: void does not have a return
		 * then name
		 */
		
		
		//parameter is a parking spot, argument is a car. car gets passed into the parking spot
		
		//invokes sayHello method
		sayHello("Harold");
		multiplyName("Nick", 3);
	}
	
	//this declares method
	
	public static void sayHello (String name) {
		System.out.println("Hello, " + name);
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		  }
	}
	
	public static void multiplyName (String name, int times) {
		 		;
	}
	
	//method names are verbs because they do something
	//variable names are nouns
	//meaningful names = easy to determine what they need
	
//	public static int findStudentIndex(String[] array, String name) {
//		return
//		
//	}

}
