package weekThreeNotes;
	import java.util.Arrays;
	import java.util.Scanner;

		public class Leland {
			
				static boolean exit;
				/*
				 * Coding - Refactor your menu driven application from last weeks homework to 
				 * use methods instead of just a procedural programming style. Create as many 
				 * methods as needed to make it more readable; at minimum, you should have 
				 * 1) a method that prints your menu (user choices available); 2) and a method 
				 * that handles each decision (what happens when a user picks an option).
				 * 
				 * After refactoring, add an array to your application and write functionality 
				 * that allows the user to 1) add a new element to the array; 2) view a specific 
				 * element in the array; 3) display all elements in the array; 4) delete a specific 
				 * element in the array; 5) delete all elements in the array.
				 * Create proper validation to ensure an exception isn't thrown while reading 
				 * or writing from the array.
				 */
				public static void main(String[] args) {
					
					Leland menu = new Leland();
					menu.runMenu();	
					}	
				
				public void runMenu() {		
					printHeader();
							
						while (!exit) {
							printMenu();
							int choice = getInput();
							performAction(choice); 	
						}
				}	
				
				private void printHeader() {
							System.out.println(".........................................................");
							System.out.println("             	You Have Entered"						  );
							System.out.println("             	 Leiland's Mind"						  );
							System.out.println(".........................................................");
				}
				
				private void printMenu() {
							System.out.println("\n...........Please Make a Selection.......................");
							System.out.println("1) What the, How did I get here?!");
							System.out.println("2) Sweet, what is on your mind Leiland?");
							System.out.println("3) Tell me something interesting..");
							System.out.println("4) How do I get out of here??!");
							System.out.println("5) Let's do a little exploring while we're in here...");
							System.out.println(".........................................................");
				}

				private void performAction(int choice) {
						switch(choice) {
							case 0:
								exit = true;
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nIt was a pleasure to have you inside of my mind. Until we meet again.");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								break;
							case 1:
								pickExplain();
								break;
							case 2:
								pickThought();
								break;
							case 3:
								pickMystery();
								break;
							case 4:
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nSelect the magic number 0 to leave. Good day sir");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								break;
							case 5:
								pickExplore();
								break;
							default:
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nI'm experiencing a stupor of thought... an error has occured.");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								break;
						}
				}
				
				private void pickExplain() {
						int num  = (int) (Math.random()* 6);
						switch (num) {
							case 0:
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nYou're not really here");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^");
								break;
							case 1:
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nYou were abducted by aliens");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								break;
							case 2:
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nYou are actually Lucid Dreaming right now");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								break;
							case 3:
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nThe magic of science");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^");
								break;
							default:
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nI'm experiencing a stupor of thought... an error has occured.");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								break;
						}
						
					}
				
				private void pickThought() {
						System.out.println("It depends on your age... how old are you?");	
							Scanner sc = new Scanner(System.in);			
							int choice = sc.nextInt();
							if (choice  >18 && choice < 105) {
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nMy great great Uncle Henry used to say, 'Be careful with a man who will come to you"
									+ "	\nwith stories of another, because he will surely leave with a new story to tell'");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
							} else if (choice <18) {
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\n'As you think, so shall you become -Bruce Lee'");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
							} else {
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");		
								System.out.println("\nHmm. Interesting choice, I think I'll keep my thoughts to myself.");	
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");	
							}	
							//sc.close();
							
					}
				
				private void pickMystery() {
						int num  = (int)(Math.random() * 3);
						switch (num) {
							case 0:
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nReal living is living for others -Bruce Lee");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								break;
							case 1:
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nAssume the good and doubt the bad");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								break;
							case 2:
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nHave you done any good in the world today? Have you helped someone else in need?");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								break;
							case 3:
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nWhy do we call horned toads toads, when they are quite obviously lizards?");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								break;
							default:
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								System.out.println("\nI'm experiencing a stupor of thought... an error has occured.");
								System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
								break;
						}
						
					}	
				
				private static void pickExploreHeader() {
					System.out.println("\n*********************************************************");
					System.out.println("\nLook! We found where Leiland keeps his current interests!");
					System.out.println("\n*********************************************************");
					System.out.println("\n.........................................................");
					System.out.println(".................What should we do?......................");
					System.out.println(".........................................................");
					System.out.println("......1) Let's peek and see what they are!...............");
					System.out.println("......2) Let's incept his mind with our own interest!....");
					System.out.println("......3) Let's take a closer look........................");
					System.out.println("......4) Let's remove one of his interests! mua ha ha....");
					System.out.println("......5) LET'S REMOVE THEM ALL...........................");
					System.out.println("......6) Let's get out of here...........................");
					System.out.println(".........................................................");
					System.out.println("\n*********************************************************");

				}
				
				private static void pickExplore() {
						pickExploreHeader();
						int choice = getInput2();
						performExplore(choice);
						}	
				
				private int getInput() {
					Scanner kb = new Scanner(System.in);
					int choice = -1;
					while(choice < 0 || choice > 5) {
						try {
							System.out.print("\nEnter your selection:");
							choice = Integer.parseInt(kb.nextLine());
							
						}
						catch (NumberFormatException e) {
							System.out.println("The instructions were pretty simple... please try again.");
							
						}
					}
					return choice;		
				}	

				private static int getInput2() {
					Scanner pe = new Scanner(System.in);
					int choice = -1;
					while(choice < 0 || choice > 6) {
						try {
							System.out.print("\nEnter your selection:");
							choice = Integer.parseInt(pe.nextLine());	
						}
						catch (NumberFormatException e) {
							System.out.println("\nThe instructions were pretty simple... please try again.");	
						}
					}
					return choice;		
				}
				
				private static String getInput3() {
					Scanner ad = new Scanner(System.in);
					String incept = ad.nextLine();
					return incept;
					
				}
				
				private static void performExplore(int choice) {
					String[] thoughtList = new String[10];
					thoughtList[0] = "Jesus' ministry and attributes";
					thoughtList[1] = "The Scriptures, symbols and the 2nd coming";
					thoughtList[2] = "Astrophysics and the Electric Universe";
					thoughtList[3] = "Scorpions and venom in general";
					thoughtList[4] = "Psychedelics and a connection to the spirit realm";
					thoughtList[5] = "Java!";
					thoughtList[6] = "Woodworking and welding";
					thoughtList[7] = "Gardening and chemistry";
					thoughtList[8] = "Music, poetry and rhythm";
					thoughtList[9] = "";

					switch(choice) {
						case 1:
						//Display all elements
							System.out.println("\nWhoa, a bunch of weird stuff!\n");
							for (int i = 0; i < thoughtList.length; i++) {
								System.out.println(i+1 + ") " + thoughtList[i]);
							}	
							System.out.println("\nWhat else whould you like to do?");
							pickExplore();
						case 2:
						//Add an element
							System.out.println("\nWhat topic do you wish to incept Leiland with?\n");
							String incept = getInput3();
							thoughtList[9] = incept;
							System.out.println("\nAlright, lets see if it worked...\n");
							System.out.println("\nWhoa, you did it! Look there it is inside his mind!!\n");
							for (int i = 0; i < thoughtList.length; i++) {
								System.out.println(i+1 + ") " + thoughtList[i]);
							}	
							System.out.println("\nWhat else whould you like to do?");
							pickExplore();
						case 3:
						//View a specific element
							Scanner id = new Scanner(System.in);
							System.out.println("\nWhich topic on his mind do you want to inspect?\n");
							System.out.println("Pick a topic by number, 1-10: ");
							int pick = id.nextInt();
							System.out.println(thoughtList[pick - 1]);
							System.out.println("\n!!!	There you have it!  What a fine thought indeed.\n");
							System.out.println("OK... what's next?");
							pickExplore();
						case 4:
						//Delete a specific element
							System.out.println("\nWhich current interest of his do you wish to erase?\n");
							for (int i = 0; i < thoughtList.length; i++) {
								System.out.println(i+1 + ") " + thoughtList[i]);
							}
							System.out.println("Select 1-10: ");
							Scanner dc = new Scanner(System.in);
							int del = dc.nextInt();
							thoughtList[del - 1] = "";
							for (int i = 0; i < thoughtList.length; i++) {
								System.out.println(i+1 + ") " + thoughtList[i]);
							}	
							System.out.println("\n************************************************************");
							System.out.println("\n... You better run - before he realizes what you've done!?\n");
							System.out.println("************************************************************\n");
							break;
						case 5:
						//Delete all elements
							System.out.println("\nI don't think he'll appreaciate this...\n");
							Arrays.fill(thoughtList, "");
							for (int i = 0; i < thoughtList.length; i++) {
								System.out.println(i+1 + ") " + thoughtList[i]);
							}	
							System.out.println("\n... You better find the exit quick - before he realizes what you've done!?\n");
							break;
						case 6:
						//exit
							exit = true;
							System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
							System.out.println("\nIt was a pleasure to have you inside of my mind. Until we meet again.");
							System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
							break;			
						default:
							System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
							System.out.println("\nI'm experiencing a stupor of thought... an error has occured.");
							System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");					
							break;
					}		

		}
}



