package Assignments;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stud = new Students();
		stud.getStudentInfo();
		stud.getStudentInfo(7890);
		stud.getStudentInfo(9090, "srija");
		stud.getStudentInfo(3456, "Roja", "aerospace", 5677889952L);
	}

	public void getStudentInfo() {
		System.out.println("Student Id is : 5179");
		System.out.println("Student Name is : Jennifer");
		System.out.println("Student Department is : Computer Science");
		System.out.println("Phone no is : 8590588567");
		System.out.println("------------------------------------------");
	}

	public void getStudentInfo(int id) {
		System.out.println("Student Id is : " + id);
		System.out.println("Student Name is : Jessi");
		System.out.println("Student Department is : ECE");
		System.out.println("Phone no is : 90786534");
		System.out.println("------------------------------------------");
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id is : " + id);
		System.out.println("Student Name is : " + name);
		System.out.println("Student Department is : EEE");
		System.out.println("Phone no is : 123445666 ");
		System.out.println("------------------------------------------");
	}

	public void getStudentInfo(int id, String name, String dept, long phone) {
		System.out.println("Student Id is : " + id);
		System.out.println("Student Name is : " + name);
		System.out.println("Student Department is : " + dept);
		System.out.println("Phone no is : " + phone);

	}

}
