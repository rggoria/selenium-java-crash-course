
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		// Variables
		String greetings = "Welcome User";
		String firstName = "Ram Emerson";
		char middleInitial = 'S';
		String lastName = "Goria";
		int age = 24;
		double height = 1.52;
		boolean graduate = true;
		
		System.out.println("Variables");
		System.out.println(greetings + ": " + firstName + " " + middleInitial + " " + lastName);
		System.out.println("Your Current Age is: " + age);
		System.out.print("\n");
		
		// Arrays
		// Method 1: Basic
		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		
		// Method 2: Shortcut
		int[] arr2 = {1,3,5,7,9};
		
		System.out.println("Arrays");
		System.out.println("From variable arr " + arr[1]);
		System.out.print("\n");
		
		// For Loop
		System.out.println("For Loop");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("From variable arr " + arr[i]);
		}
		System.out.print("\n");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("From variable arr2 " + arr2[i]);
		}
		
		String[] friends = {"Clifford", "Christian", "Adrian", "Napoleon"};
		System.out.print("\n");
		for (int i = 0; i < friends.length; i++) {
			System.out.println("From variable friends " + friends[i]);
		}
		System.out.print("\n");
		
		// Enhanced For Loop
		System.out.println("Enhanced For Loop");
		for (String s: friends) {
			System.out.println("From variable friends using with enhanced " + s);
		}
		
		
		
	}

}
