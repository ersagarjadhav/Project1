package practice;

class Comp
{
private int emp_id;

public void setEmp_id(int emp_id2)
{
	emp_id=emp_id2;
	
	
}

public int getEmp_id()
{
	return emp_id;
	
}


}


public class Employeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comp c=new Comp();
		
		c.setEmp_id(105);
		
		System.out.println(c.getEmp_id());
		
		

	}

}
