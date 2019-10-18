package StudentDetails;

public class CivilStudents implements Student {

	@Override
	public void getName(String name) {
			System.out.println("Student name is: "+name);
	}

	@Override
	public void getPercentage(double percent) {
			System.out.println("Student final year percentage is: "+percent+" %");
	}

	@Override
	public void displayBranch() {
			System.out.println("Student Branch is CIVIL ENGINEERING");
	}

}
