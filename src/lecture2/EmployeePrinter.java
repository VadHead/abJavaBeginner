package lecture2;

public class EmployeePrinter implements Printer{
	
	@Override
	public void print(Employee employee) {
		System.out.println(employee.FirstName + " " + employee.LastName);
	}
	
}
