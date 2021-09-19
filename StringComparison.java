package Assignments;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first = "I am Learning Java";
		String secod = "I am learning java?";

		if (first.equals(secod)) {
			System.out.println("String is comparing using Equals ");

		}

		else if (first.equalsIgnoreCase(secod)) {
			System.out.println("String is comparing using Equalignore case ");

		}

		else if (first == secod) {
			System.out.println("String is comparing using == ");

		}

		else {
			System.out.print("Both strings are not equal");
		}

	}

}
