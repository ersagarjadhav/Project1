package assreturn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj=new Employee();
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the id");
		int a=sc.nextInt();
		obj.setemployeeId(a);
		
		System.out.println("Enter the name");
		String x=sc.next();
		obj.setemployeeName(x);
		
		System.out.println("Enter the salary");
		double c=sc.nextDouble();
		obj.setsalary(c);
		
		
		System.out.println("Enter the pf Percentage");
		int  d=sc.nextInt();
		obj.calculateNetSalary(d);
		
		
		
		System.out.println("Id" +obj.getemployeeId());
		System.out.println("Name" +obj.getemployeeName());
		System.out.println("Salary" +obj.getsalary());
		System.out.println("Net Salary" +obj.getnetSalary());
		
		
		
		
		
		
		
		
		

	}

}
