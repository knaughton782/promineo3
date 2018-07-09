package weekThreeNotes;

import java.util.Scanner;

public class TeamApp {
	static Scanner sc = new Scanner(System.in);
	static int addingIndex = 0;

	public static void main(String[] args) {
		
		String[] team = new String[5];
		int userDecision = 0;
		
		while(userDecision != -1) {
			showMenu();
			
			userDecision = sc.nextInt();
			
			if (userDecision < -1 || userDecision > 5) {
				System.out.println("Please pick a valid option.");
				
			} else if (userDecision == 1) {
				showTeam(team);
				
			} else if (userDecision == 2) {
				showTeamMember(team);
				
			} else if (userDecision == 3) {
				addTeamMember(team);
				
			} else if (userDecision == 4) {
				deleteTeamMember(team);
				
			} else {
				deleteTeam(team);
				
			}
			
		}

	}
	
	public static void showTeam(String[] team) {
		System.out.println("List of Team Members"
				+ ": ");
		for (int i = 0; i < team.length; i++) {
			System.out.println(i + ": " + team[i]);
		}
	}
	
	public static void showTeamMember(String[] team) {
		System.out.print("Which team member would you like to see?");
		int teamNumber = sc.nextInt();
		if (isValid(teamNumber)) {
		System.out.println(teamNumber + ": " + team[teamNumber]);
		} 
		
	}
	
	public static void addTeamMember(String[] team) {
		System.out.print("Enter new member name: ");
		String newMember = sc.next();
		if (isValid(addingIndex)) {
		team[addingIndex++] = newMember;
		} 
		
	}
	
	public static void deleteTeamMember(String[] team) {
		System.out.println("Which team member would you like to delete?");
		int memberToDelete = sc.nextInt();
		if (isValid(memberToDelete)) {
			team[memberToDelete] = null;
		}
	}
	
	public static void deleteTeam(String[] team) {
		for (int i = 0; i < team.length; i++) {
			team[i] = null;
		}
	}
	
	public static boolean isValid(int input) {
		if (input > -1 && input < 5) {
			return true;
		} else {
			System.out.println("Invalid entry");
			return false;
		}
	}
	
	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit.");
		System.out.println("1) Show All Team Members");
		System.out.println("2) Show a Team Member");
		System.out.println("3) Add a Team Members");
		System.out.println("4) Delete a Team Member");
		System.out.println("5) Delete All Team Members");
		
	}

}
