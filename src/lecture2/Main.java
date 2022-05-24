package lecture2;

public class Main {
	
	public static void main(String[] args) {
		
		EmployeePrinter printer = new EmployeePrinter();
		Employee employee = new Employee("Something", "New");
		
		printer.print(employee);
	}
	
}
