
public class uc_4 {

	public static void main(String[] args) {
		int numOfWorkingDays = 20;
		int totalEmpHr = 0;
		int totalWorkingDays = 0;
		int empHrs = 0;

		double randomCheck = Math.floor(Math.random() * 10) % 2;
		int i = (int) randomCheck;
		switch (i) {
		case 1:
			System.out.println("Employee is FullTime");
			empHrs = 8;
			break;
		case 0:
			System.out.println("Employee is PartTime");
			empHrs = 4;
			break;

		}
	}
}
