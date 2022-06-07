package lecture2;

public class Employee {
	
	public String firstName;
	public String lastName;
	public int age;
	public String team;
	public long salary;
	public POSITION position;
	
	public Employee(String firstName, String lastName, int age, String team, POSITION position) {
		this(firstName, lastName, age, team, 0, position);
	}
	
	public Employee(String firstName, String lastName, int age, String team, long salary, POSITION position) {
		if (age < 18) {
			System.out.println("Incorrect age value");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.team = team;
		
		if (salary == 0){
			salary = position.minSalary;
		}
		this.salary = salary;
		this.position = position;
	}
	
}
