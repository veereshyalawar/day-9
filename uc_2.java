import java.util.Random;

public class uc2 {

	public static void main(String[] args) {
		int Is_Part_Time = 0;
		int Is_Full_Time = 1;
		int EmpHrs = 8;
		int emp_wages_pHr = 20;
		int emp_daily_wage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;

		emp_daily_wage = (EmpHrs * emp_wages_pHr);
		if (empCheck == Is_Full_Time)
			;
		{
			emp_daily_wage = (EmpHrs * emp_wages_pHr);
			System.out.println("employ daily salary :" + emp_daily_wage);
		}

	}
}