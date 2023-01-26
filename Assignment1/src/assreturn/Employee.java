package assreturn;

public class Employee 
{
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public void setemployeeId(int employeeId)
	{
		this.employeeId=employeeId;
	}
	
	public int getemployeeId()
	{
		return employeeId;
	}
	
	public void setemployeeName(String employeeName)
	{
		this.employeeName=employeeName;
	}
	
	
	public String getemployeeName()
	{
		return employeeName;
	}
	
	
	public void setsalary(double salary)
	{
		this.salary=salary;
	}
	
	public double getsalary()
	{
		return salary;
	}
	
	
	public void setnetSalary(double netSalary)
	{
		this.netSalary=netSalary;
	}
	
	public double getnetSalary()
	{
		return netSalary;
	}
	
	
	public void calculateNetSalary(int  pfPercentage)
	{
		
		
       netSalary  =salary - ((pfPercentage * salary)/100);
       System.out.println(netSalary);
       
       
	}
	
	
	
	
}
