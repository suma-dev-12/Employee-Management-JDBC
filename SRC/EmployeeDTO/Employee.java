package EmployeeDTO;

public class Employee {
   
	private int id;
	private String name;
	private String designation;
	private int salary;
	
	
   Employee(){
	   
   }
	
   public Employee(int id,String name,String designation,int salary){
	   this.id=id;
	   this.name=name;
	   this.designation=designation;
	   this.salary=salary;
	   
   }
   
   public  int getId() {
	   return id;
   }
   public String getName() {
	   return name;
   }
   public String getDesignation() {
	   return designation;
   }
   public int getSalary() {
	   return salary;
   }
   
   public void setId(int id) {
	   this.id=id;
   }
   public void setName(String name) {
	   this.name=name;
   }
   public void setDesignattion(String designation) {
	   this.designation=designation;
   }
   public void setSalary(int salary) {
	   this.salary=salary;
   }
	
   @Override
   public String toString() {
	   return  "[Id"+"="+id+"  " +"Name"+"="+name+"  "+"Designation"+"="+designation+"  "+"Salary"+"="+salary+"]";
   }
	
}
