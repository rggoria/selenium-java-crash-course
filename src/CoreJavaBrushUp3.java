
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// string is an  object / String literal
		// String s1 = "Selenium Crash Course";
		String s5 = "hello";
		
		// new allocate operator
		String s2 = new String("Hello");
		String s3 = new String("Hello");
		
		// Splitted String
		System.out.println("Splitted String");
		String s = "Selenium Crash Course";
		System.out.println("Original: " + s);
		System.out.println("*****Method 1: By Whitespace*****");
		String[] splittedString =  s.split(" ");
		System.out.println("Splitted: " + splittedString[0]);
		System.out.println("Splitted: " + splittedString[1]);
		System.out.println("Splitted: " + splittedString[2]);
		System.out.println("*****Method 2 By Word*****");
		String[] splittedString1 =  s.split("Crash");
		System.out.println("Splitted: " + splittedString1[0]);
		System.out.println("Splitted: " + splittedString1[1]);
		System.out.println("Splitted: " + splittedString1[1].trim());
		System.out.print("\n");
		System.out.println("*****Method 3 By Character*****");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("*****Method 4 By Reversed Character*****");
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
