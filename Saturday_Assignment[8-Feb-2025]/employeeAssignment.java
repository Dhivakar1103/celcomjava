package assignment;

class Employee {
	String name;
	String jobTitle;
	double salary;

	Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void updateSalary(double newSalary) {
		salary = newSalary;
	}

	public void calculateSalaryIncrease(double percentage) {
		salary += salary * percentage / 100;
	}

	public void printEmployeeDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Job Title: " + jobTitle);
		System.out.println("Salary: " + salary);
	}
}

public class employeeAssignment {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Dhivakar", "Software Engineer", 60000);

		emp1.printEmployeeDetails();

		emp1.updateSalary(65000);
		System.out.println("\nAfter Salary Update:");
		emp1.printEmployeeDetails();

		emp1.calculateSalaryIncrease(10);
		System.out.println("\nAfter 10% Salary Increase:");
		emp1.printEmployeeDetails();
	}
}
