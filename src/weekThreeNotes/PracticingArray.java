package weekThreeNotes;

public class PracticingArray {

	public static void main(String[] args) {
		
		String[] reasons = new String[6];
		
		reasons[0] = "Because I said so";
		reasons[1] = "It's good for  you";
		reasons[2] = "It's the right thing to do";
		reasons[3] = "For what it will make of you";
		reasons[4] = "It will make you feel better";
		reasons[5] = "It makes others happy";
		
		System.out.println("Traditional for loop - String");
		for (int i = 0; i < reasons.length; i++) {
			System.out.println(reasons[i]);
		}	
		
		System.out.println("Enhanced for loop - String");
		for (String reason : reasons) {
			System.out.println(reason);
		
		}
		
		int[] nums = new int[] {1, 4, 6, 8, 5, 0};
		
		System.out.println("Traditional for loop - int");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + 25);
		}
		
		System.out.println("Enhanced for loop - int");
		for (int num : nums) {
			System.out.println(num + 33);
		}
		
	}

}
