package lecture2;

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
		
	}
	
}
