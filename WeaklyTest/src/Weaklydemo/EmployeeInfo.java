package Weaklydemo;

class Department{
		protected int deptid;
		protected String deptname;
		Department(){
		}
		Department(int deptid,String deptname){
		this.deptid=deptid;
		this.deptname=deptname;

		}
		public String toString(){
		return "Department:"+deptid+" "+deptname;
		}
		}
		class Mydate{
		protected String day;
		protected int month,year;
		Mydate(){
		}
		Mydate(String day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
		}
		public String toString(){
		return "Mydate:"+day+" "+month+" "+year;
		}
		}
		class Employee{
		private int id;
		private String name;
		private double salary;
		private Department dept;
		private Mydate mydate;
		Employee(){
		}
		Employee(int id,String name,double salary,Department dept,Mydate mydate){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		this.mydate=mydate;
		}
		public void setId(int id){
		this.id=id;
		}
		public int getId(){
		return id;
		}
		public void setName(String name){
		this.name=name;
		}
		public String getName(){
		return name;
		}
		public void setSalary(double salary){
		this.salary=salary;
		}
		public double getSalary(){
		return salary;
		}
		public void setDepartment(Department dept){
		this.dept=dept;
		}
		public Department getDepartment(){
		return dept;
		}
		public void setMydate(Mydate mydate){
		this.mydate=mydate;
		}
		public Mydate getMydate(){
		return mydate;
		}
		public String toString(){
		return "Employee:"+id+" "+name+" "+salary+" "+dept+" "+mydate;
		}
		}
		public class EmployeeInfo{
		public static void main(String args[]){
		Employee e1=new Employee(101,"Dinesh",50000,new Department(1012,"Quality"),new Mydate("Monday",2,5));
		System.out.println(e1);
		
		
		// TODO Auto-generated method stub

	}

}
