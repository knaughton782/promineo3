package weekThreeNotes;

public class MethodPractice {

	public static void main(String[] args) {
		//Write a method that takes 2 strings, firstName and lastName, and returns fullName
		
		System.out.println(fullName("James", "Smith"));
		System.out.println(add(1, 4));
		System.out.println(multiply(4, 6));
		System.out.println(multiplyString("Yay", 3));
		
	}
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static String multiplyString(String str, int num) {
		String result = "";
		
		for (int i = 0; i < num; i++) {
			result += str;
			
		}
		return result;
	}
}
