package weekThreeNotes;

public class MultipleVariables {

	public static void main(String[] args) {

		//List of student names
		
//		String studentOne = "Leland";
//		String studentTwo = "Sam";
//		String studentThree = "Daniel";
//		String studentFour = "Kirsten";
//		String studentFive = "Keith";
		
		
		//can print them all out one at a time but an array is a better way to classify similar values
		
		//to declare an array
		String[] students = new String[5]; 
		
		students[0] = "Leland";
		students[1] = "Sam";
		students[2] = "Daniel";
		students[3] = "Kirsten";
		students[4] = "Keith";
		
		
		
		//loop over array with for loop
		
//		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i]);
//		}
		
		
		//enhanced for loop (same as for each)
		
		for (String student : students) {
			System.out.println(student);
			System.out.println(student + " is awesome!");
		}
	}

}
