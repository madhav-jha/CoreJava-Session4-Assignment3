package session4.assignment3;

public class EmployeeReference {

	public static void main(String[] args) {
		Employee e1 = new Employee(1607, "Randy", 6709.89, "IT");
		Employee e2 = new Employee(1608, "Michael", 7654.09, "Finance");
		
		System.out.println("Details of employee e1:\n");
		System.out.println("Name:"+e1.empName);
		System.out.println("Employee ID:"+e1.empId);
		System.out.println("Department:"+e1.dept);
		System.out.println("Salary:"+e1.salary);
		
		System.out.println("\nDetails of employee e2:\n");
		System.out.println("Name:"+e2.empName);
		System.out.println("Employee ID:"+e2.empId);
		System.out.println("Department:"+e2.dept);
		System.out.println("Salary:"+e2.salary);
		

	}

}
