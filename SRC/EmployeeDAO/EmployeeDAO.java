package EmployeeDAO;

import java.util.List;

import EmployeeDTO.Employee;

public interface EmployeeDAO {
	
	List getEmployees();
	Employee getEmployee(int id);
	boolean insertEmployee(int id,String name,String designation,int salary);
	boolean updateEmployee(Employee e);
	boolean deleteEmployee(int id);
	

}
