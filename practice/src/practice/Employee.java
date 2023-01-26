package practice;

 class Company {
	
	private int emp_id;      //data hiding
	
	public void setEmpId(int emp_id1)
	{
		emp_id=emp_id1;
	}
	
	public int getEmpid()
	{
		return emp_id;
	}

}
class Employee
{
   public static void main(String[] args) {
	
	   Company c=new Company();
	   c.setEmpId(101);
	   
	   System.out.println(c.getEmpid());
	   
}	
}
 