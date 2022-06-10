package lecture2.employee;

import lecture2.Printer;

public class EmployeeSalaryPrinter implements Printer {
	
	@Override
	public void print(Employee employee) {
		if (employee.getSalary() < 0) {
			System.out.println("Incorrect salary value");
		}else if (employee.getSalary() >= 5000) {
			System.out.println("Salary: " + employee.getSalary());
		}
	}
}
