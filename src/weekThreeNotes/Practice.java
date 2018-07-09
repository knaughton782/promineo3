package weekThreeNotes;

public class Practice {

	public static void main(String[] args) {
		int[] myArray = new int[3];
		myArray[0] = 7;
		myArray[1] = 17;
		myArray[2] = 77;
		
		double[] grades = new double[5];
		grades[0] = 88.65;
		grades[1] = 80.65;
		grades[2] = 28.05;
		grades[3] = 88.75;
		grades[4] = 56.65;
		
		
		System.out.println(sumArray(myArray));
		System.out.println(calculateAvg(grades));
		System.out.println(multiplyString("happy", 4));
		
		
	}
	
	//array of ints and return sum of ints
	public static int sumArray(int[] numbers) {
		int sum = 0; //keep track of sum of all int
		//iterate over the array
		
		for (int number : numbers) {
			sum += number;
		}
		return sum;
		
	}
	//Take array of double and return avg of all elements in the array
	public static double calculateAvg(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	
	//take string and int and return string concatenated int number of times
	public static String multiplyString(String name, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += name;
		}
		return result;
	}

}
