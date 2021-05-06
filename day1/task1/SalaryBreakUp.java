package day1.task1;

public class SalaryBreakUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int basicSalary = 10000;
		int hra = 40 * (basicSalary/100);
		int da = 60 * ((basicSalary + hra)/100);
		int annualSalary = (basicSalary + hra + da)*12;
		if(annualSalary <= 200000) {
			System.out.println("Tax Amount: 0");
			System.out.println("Take home salary:" + annualSalary);
		} else if(annualSalary > 200000 && annualSalary <= 600000) {
			int tax = 10 * (annualSalary/100);
			int takeHomeSalary = annualSalary - tax;
			System.out.println("Tax Amount:" + tax);
			System.out.println("Take home salary:" + takeHomeSalary);
		} else {
			int tax = 20 * (annualSalary/100);
			int takeHomeSalary = annualSalary - tax;
			System.out.println("Tax Amount:" + tax);
			System.out.println("Take home salary:" + takeHomeSalary);
		}
	}

}
