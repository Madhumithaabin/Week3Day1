package Assignments;

public class SubstringFinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I am working with Java8";
		String replace = sentence.replace("8", "11");
		System.out.println("After replacing 8 with 11 : " + replace);
		char ch = '#';
		String finalout = replace + ch;
		System.out.println("Special Character # is added at end of the string : " + finalout);
		System.out.println("Printing from 5 to 14: " + finalout.substring(5, 14));
	}

}
