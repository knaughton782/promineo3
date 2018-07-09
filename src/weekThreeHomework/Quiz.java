package weekThreeHomework;

public class Quiz {

		
		/**********************************************************************************
		 * Multiple Choice: 2 points each
		 **********************************************************************************/
		
		/* 1. On Window's Command Prompt, which of the following commands shows the contents of 
		 * 	  the current directory?
		 * 	a. ls
		 * 	b. dir
		 * 	c. cd
		 * 	d. show
		 */
		 char answer1 = 'b'; //a for mac
		  
		/* 2. What data type would be best suited for a variable called firstName?
		 * 	a. char
		 * 	b. string
		 * 	c. boolean
		 * 	d. String
		 */
		 char answer2 = 'd';
		  
		/* 3. Which company owns Java?
		 * 	a. Sun Systems
		 * 	b. Oracle
		 * 	c. Microsoft
		 * 	d. Intel
		 */
		 char answer3 = 'b'; 
		 
		/* 
		 * 4. Which data type would be best suited for storing data such as number of friends?
		 * a. int
		 * b. double
		 * c. float
		 * d. char
		 */ 
		 char answer4 = 'a';
		 
		/* 
		 * 5. Which data type would be best suited for storing a middle initial?
		 * a. Boolean
		 * b. String
		 * c. int
		 * d. char
		 */ 
		 char answer5 = 'd';
		 
		/* 
		 * 6. Which of the following examples is an accurate variable declaration?
		 * a. var firstName = '';
		 * b. String name = "Tommy"
		 * c. boolean isHot = "true";
		 * d. char middleInitial = 'C';
		 */ 
		 char answer6 = 'd';
		 
		/* 
		 * 7. A ________ performs a calculation on two operands and returns the resulting value.
		 * a. Variable
		 * b. Repository
		 * c. Operator
		 * d. Identifier
		 */ 
		 char answer7 = 'c';
		 
		/* 
		 * 8. Which of the following is not a Boolean Operator?
		 * a. &&
		 * b. =>
		 * c. ||
		 * d. ==
		 */ 
		 char answer8 = 'b';
		 
		/* 
		 * 9. Which of the following loops will always iterate at least once?
		 * a. Do While
		 * b. For
		 * c. While
		 * d. Enhanced For
		 */ 
		 char answer9 = 'a';
		 
		/* 
		 * 10. Which of the following For loops will compile?
		 * a. for (int i = 0, i < 10, i++) {}
		 * b. for (int i = 10; i > 0; i--) {}
		 * c. For (int i = 0; i < 25; i++) {}
		 * d. for int i = 1; i < 10; i++ ()
		 */ 
		 char answer10 = 'c';
		 
		/* 
		 * 11. What does the following evaluate to? true && 1 == 1.
		 * a. true
		 * b. false
		 * c. does not compile
		 * d. 1
		 */ 
		 char answer11 = 'a';
		 
		/* 
		 * 12. What does the following loop print? (ignore the asterisks)
		 * int i = 0;
		 * while (i < 10) {
		 *   System.out.println(i);
		 * }
		 * a. 1 through 10
		 * b. 0 through 9
		 * c. 0 over and over without stopping
		 * d. 0 ten times
		 */ 
		 char answer12 = 'c';
		 
		/* 
		 * 13. A(n) ________ is a loop that never terminates.
		 * a. While loop
		 * b. Non compiling loop
		 * c. Never ending loop
		 * d. Infinite loop
		 */ 
		 char answer13 = 'd';
		 
		/* 
		 * 14. Which of the following are used to denote an array?
		 * a. []
		 * b. {}
		 * c. ()
		 * d. //
		 */ 
		 char answer14 = 'a';

		/* 
		 * 15. How would you access the last element in an array named `array` with a length of 5?
		 * a. array[5];
		 * b. array(4);
		 * c. array[last];
		 * d. array[4];
		 */ 
		 char answer15 = 'd';
		 
		/* 
		 * 16. How would you access the last element in an array named `array` if you didn't know the length?
		 * a. array[last];
		 * b. array[array.length - 1];
		 * c. array[length];
		 * d. array[array.length + 1];
		 */ 
		 char answer16 = 'b';
		 
		/* 
		 * 17. A return type of ______ means a method returns no value.
		 * a. double
		 * b. null
		 * c. void
		 * d. nothing
		 */ 
		 char answer17 = 'c';
		 
		/* 
		 * 18. Which of the following is an accurate method declaration?
		 * a. public static double doSomething(int a, int b) {}
		 * b. public static int doSomething(int a, int b) {}
		 * c. public static doSomething(int a, int b) {}
		 * d. public static void doSomething(int a, int b) {}
		 */ 
		 char answer18 = 'b';
		 
		/* 
		 * 19. What keyword is used to instantiate an object?
		 * a. create
		 * b. new
		 * c. make
		 * d. init
		 */ 
		 char answer19 = 'b';
		 
		/* 
		 * 20. When comparing Object equality, which of the following is false?
		 * a. == will return true if both variables refer to the same object in memory.
		 * b. == will return true if both objects have the same values in all properties.
		 * c. .equals() will usually return true if both objects have the same values.
		 * d. Both a and b.
		 */ 
		 //------------------------------>
		 char answer20 = ' ';
		 
		/**********************************************************************************
		 * true or false: 2 points each
		 **********************************************************************************/
		 
		// 21. In Command Prompt, cd ../.. will navigate up two directories.
		boolean answer21 = true;
		 
		// 22. git is a source control tool.
		boolean answer22 = true;
		
		// 23. In the git workflow you must stage new files with `git add` before you can commit them.
		boolean answer23 = true;
		
		// 24. `git grab` will sync your local repository with the remote origin.
		boolean answer24 = false;
		
		// 25. James Gosling is known as the Father of Java.
		boolean answer25 = true;
		
		// 26. There are 7 primitive data types in Java.
		boolean answer26 = false;
		
		// 27. The modulus operator returns the number of times the right operand is divisible by the left.
		boolean answer27 = false;
		
		// 28. What does this evaluate to? true || false
		boolean answer28 = true;
		
		// 29. There can be multiple `else` blocks to one if statement.
		boolean answer29 = false;
		
		// 30. An `else` block will only execute if the conditions in the `if` and all `else if`s evaluate to false.
		boolean answer30 = true;
		
		// 31. A for loop will always iterate at least once.
		boolean answer31 = false;
		
		// 32. A while loop is preferred when you know the number of iterations you will perform.
		boolean answer32 = false;
		
		// 33. If the condition in an `if` statement is true, `else if` statements associated with
		//     that `if` statement can still be evaluated.
		boolean answer33 = false;
		
		// 34. someArray[1] will return the value for the first element in someArray.
		boolean answer34 = false;
		
		// 35. `public static int addIntegers(int a, int b) { int sum = a + b; }` is a valid method declaration.
		boolean answer35 = false; // return || void
		
		// 36. When you declare a method, the code inside the method does not execute until the method is called or invoked.
		boolean answer36 = true;
		
		// 37. You access methods on a variable of type int using dot notation.
		boolean answer37 = false;
		
		// 38. == can never return true when comparing Objects.
		boolean answer38 = true;
		
		// 39. `int[] myNumbers = new int[5];` instantiates an array.
		boolean answer39 = true;
		
		// 40. An array can only hold variables of the same data type as the array.
		boolean answer40 = true;
		
		
		/**********************************************************************************
		 * Essay Questions: 5 points each
		 **********************************************************************************/
		
		/* 41. Name all of the primitive data types in Java.
		 *  byte
		 *  short
		 *  int
		 *  long
		 *  char
		 *  float
		 *  double
		 *  boolean
		 */
		
		/* 42. Write a for loop that prints every even number from 0 to 100.
		 *  for (int i = 0; i <= 100; i++) {
		 *	  if (i % 2 == 0) {
		 *		System.out.println(i);
		 *  	}
		 *   }
		 */
		
		/* 43. Write a method named multiply that takes two int parameters and returns the product
		 * 	   of the two parameters.
		 *  
		 *  public static multiply (int a, int b) {
		 *  	return a * b;
		 *  }
		 */
		
		/* 44. Write a method named multiplyName that takes two parameters, a String name and and an int times.
		 *     The method should print ONE line with the name duplicated by the times parameter.
		 *     For example, if I called multiplyName("Nick", 3); it should print NickNickNick 
		 *  
		 *  	public static String multiplyString(String name, int num) {
		 *			String result = "";
		 *			for (int i = 0; i < num; i++) {
		 *				result += name;
		 *			}
		 *			return result;
		 *		}
		 *  
		 */
			 

}
