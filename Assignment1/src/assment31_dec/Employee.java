package assment31_dec;

public class Employee {
	
	int id;
	String name;
	static String company_name;
	
//	static 
//	{
//		company_name="Apple";
//	}
	
	
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	void display()
	{
		System.out.println("the company name is" + company_name);
		System.out.println("the id is" + id);
		System.out.println("the name is" + name);
		
	}
	
	static void cafeteria()
	{
		System.out.println(" Cafeteria is same for all Employee ");
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cafeteria();
		company_name="Apple";
		
		Employee obj=new Employee(1,"sagar");
		Employee obj2=new Employee(2,"Amit");
		obj.display();
		obj2.display();
		
		
		

	}

}
