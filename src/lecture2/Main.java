package lecture2;

public class Main {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Something", "New",32, "toolz", 2500, POSITION.SENIOR);
		EmployeeNamePrinter printer = new EmployeeNamePrinter();
		printer.print(employee);
		
		Employee employee2 = new Employee("", "",-1, "toolz", -50, POSITION.JUNIOR);
		
		
	}
	
}
