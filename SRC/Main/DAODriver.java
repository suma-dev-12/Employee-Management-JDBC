package Main;

import EmployeeDAO.EmployeeDAOImpl;
import java.util.Scanner;

public class DAODriver {
	public static void main(String args[]) {
		EmployeeDAOImpl empdaoimpl=new EmployeeDAOImpl();
//		List<Employee> employees=empdaoimpl.getEmployees();
//		for(Employee e :employees) {
//			System.out.println(e);
//		}
		Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the  Employee ID to be Updated: ");
		// int id=sc.nextInt();
//		
//		Employee e=empdaoimpl.getEmployee(id);
//		System.out.println(e);
//		
//		System.out.println("Enter the salary to be updated: ");
//		int sal=sc.nextInt();
//		e.setSalary(sal);
//		empdaoimpl.updateEmployee(e);
		
		// System.out.println(empdaoimpl.deleteEmployee(id));
		
		// System.out.println("Enter the Details to Insert  Record:");
		// System.out.println("Enter the Employee ID: ");
		// int id=sc.nextInt();
		// sc.nextLine();
		// System.out.println("Enter the Employee Name: ");
		// String name=sc.nextLine();
		// System.out.println("Enter the Employee Designation");
		// String desig=sc.nextLine();	
		// System.out.println("Enter the Employee Salary: ");
		// int sal=sc.nextInt();
		// System.out.println(empdaoimpl.insertEmployee(id, name, desig, sal));

	}

}
