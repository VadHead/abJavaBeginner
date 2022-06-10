package lecture2;

import lecture2.employee.Employee;
import lecture2.employee.EmployeeNamePrinter;
import lecture2.employee.EmployeeSalaryPrinter;

public class Main {
	
	public static void main(String[] args) {
		
		EmployeeNamePrinter namePrinter = new EmployeeNamePrinter();
		EmployeeSalaryPrinter salaryPrinter = new EmployeeSalaryPrinter();

		Employee employee = new Employee("Something", "New",32, "toolz", 2500, POSITION.SENIOR);
		namePrinter.print(employee);
		salaryPrinter.print(employee);
		
		Employee employee2 = new Employee("Peter", "Jackson",28, "toolz", POSITION.JUNIOR);
		namePrinter.print(employee2);
		salaryPrinter.print(employee2);
		
		Employee employee3 = new Employee.Builder()
				.firstName("Luke")
				.lastName("Skywalker")
				.age(30)
				.team("Jedi")
				.salary(30000)
				.position(POSITION.SENIOR)
				.build();
	}
	
}
