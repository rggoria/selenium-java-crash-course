import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// Conditional Statement
		System.out.println("Conditional Statement");
		int[] randomNumbers = {1,2,3,5,6,7,8,9,10,13,122};
		
		for (int i = 0; i < randomNumbers.length; i++) {
			if (randomNumbers[i] % 2 == 0) {
				System.out.println("This is even numbers " + randomNumbers[i]);
			} else {
				System.out.println("This is odd numbers " + randomNumbers[i]);
			}
		}
		System.out.print("\n");

		// ArrayList
		System.out.println("ArrayList");
		ArrayList<String> courses = new ArrayList<String>();
		// create object of the class - object method
		courses.add("web and mobile development");
		courses.add("software development");
		courses.add("random course");
		courses.add("quality assurance");
		courses.add("project management");
		courses.remove(2);
		System.out.println("From variable ArrayList courses " + courses.get(0));
		System.out.print("\n");

		// ArrayList For Loop
		System.out.println("ArrayList For Loop");
		for (int i = 0; i < courses.size(); i++) {
			System.out.println("From variable ArrayList courses " + courses.get(i));
		}
		System.out.print("\n");
		for (String val : courses) {
			System.out.println("From variable ArrayList courses " + val);
		}
		System.out.print("\n");
		
		// ArrayList Contains
		System.out.println("ArrayList Contains");
		System.out.println(courses.contains("quality assurance"));
		System.out.print("\n");
		
		// Convert List into Array
		System.out.println("Convert List into Array");
		String[] friends = {"Clifford", "Christian", "Adrian", "Napoleon"};
		List<String> friendArrayList = Arrays.asList(friends);
		for (String val : friends) {
			System.out.println("From variable ArrayList friends " + val);
		}
		System.out.println(friendArrayList.contains("Christian"));
	}

}
