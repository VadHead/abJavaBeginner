package lecture2.employee;

import lecture2.Printer;

public class EmployeeNamePrinter implements Printer {
	
	@Override
	public void print(Employee employee) {
		if (employee.getFirstName().isEmpty() || employee.getLastName().isEmpty()) {
			System.out.println("First name or Last name cannot be empty");
		}
		else {
			System.out.println("First name: " + employee.getFirstName());
			System.out.println("Last name: " + employee.getLastName());
			System.out.println("Position: " + employee.getPosition());
			
		}
	}
	
}
