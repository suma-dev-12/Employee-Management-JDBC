package EmployeeDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ConnctionFactory.ConnectionFactory;
import EmployeeDTO.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	
	ArrayList<Employee>emplist=null;
	@Override
	public List getEmployees() {
		try {
			Connection con=ConnectionFactory.requestConnection();
			String query="select * from emp";
			Statement stmt=con.createStatement();
		    ResultSet res=stmt.executeQuery(query);
		    emplist = new ArrayList<Employee>();
		    while(res.next()==true) {
		    	int id=res.getInt(1);
		    	String name=res.getString(2);
		    	String designation=res.getString(3);
		    	int salary=res.getInt(4);
		    	
		    	Employee e= new Employee(id,name,designation,salary);
		    	emplist.add(e);
		    }
		}catch 
			(Exception e) {
	
			e.printStackTrace();
		}
	return	emplist;
	}

	@Override
	public Employee getEmployee(int id) {
		Employee e1=null;
		try {
		  Connection con=ConnectionFactory.requestConnection();
		  String query="select * from emp where id =?";
		  PreparedStatement pstmt=con.prepareStatement(query);
		  pstmt.setInt(1, id);
		  ResultSet res=pstmt.executeQuery();
		  res.next();
		  
		 e1 =new Employee(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4));
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		return e1;
		
	}
	

	@Override
	public boolean insertEmployee(int id, String name, String designation, int salary) {
		int i=0;
           try {
			Connection con=ConnectionFactory.requestConnection();
		    String query="insert into emp(id,name,designation,salary)values(?,?,?,?)";
		    PreparedStatement pstmt=con.prepareStatement(query);
		    pstmt.setInt(1,id);
		    pstmt.setString(2,name);
		    pstmt.setString(3,designation);
		    pstmt.setInt(4, salary);
		    i=pstmt.executeUpdate();
		   } catch (Exception e) {
			
			e.printStackTrace();
		   }
           if(i==1) {
        	   return true;
           }
           return false;
	}
	

	@Override
	public boolean updateEmployee(Employee e) {
		int i=0;
		try {
			Connection con=ConnectionFactory.requestConnection();
			String query="update emp set salary=? where id =?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1,e.getSalary());
			pstmt.setInt(2,e.getId());
			i=pstmt.executeUpdate();
			
			
		} catch (Exception e1) {
		
			e1.printStackTrace();
		}
		
		if(i==1) {
			return true;
		}
		 return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		int i=0;
	     try {
			Connection con=ConnectionFactory.requestConnection();
			String query="delete from emp where id=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			i=pstmt.executeUpdate();
			} 
	     
	     catch (Exception e) {
			e.printStackTrace();
		 }
	     if(i==1) {
	    	 return true;
	     }
	     return false;
	     
	}
	

}
