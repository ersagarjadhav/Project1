package assignment14jan;

import java.util.Scanner;

public class Employee6 {
	int e_id;
	String e_name;
	double e_salary;
	MyDate6 d;
	Department6 dept;

	public Employee6(int e_id, String e_name, double e_salary, MyDate6 d, Department6 dept) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_salary = e_salary;
		this.d = d;
		this.dept = dept;
	}
	
	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public double getE_salary() {
		return e_salary;
	}

	public void setE_salary(double e_salary) {
		this.e_salary = e_salary;
	}

	public MyDate6 getD() {
		return d;
	}

	public void setD(MyDate6 d) {
		this.d = d;
	}

	public Department6 getDept() {
		return dept;
	}

	public void setDept(Department6 dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee6 [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary + ", d=" + d + ", dept="
				+ dept + "]";
	}

	public static void main(String[] args) {
		Employee6 empl[] = new Employee6[2];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < empl.length; i++) {
			System.out.println("Enter Employee Id : ");
			int e_id = in.nextInt();
			System.out.println("Enter Employee Name : ");
			String e_name = in.next();
			System.out.println(" Enter Employee Salary : ");
			double e_salary = in.nextDouble();
			System.out.println("Enter Department Id : ");
			int d_id = in.nextInt();
			System.out.println("Enter Department Name : ");
			String d_name = in.next();
			System.out.println("Enter Date : ");
			int date = in.nextInt();
			System.out.println("Enter Month : ");
			String month = in.next();
			System.out.println(" Enter Year : ");
			int year = in.nextInt();

			MyDate6 d = new MyDate6(date, month, year);
			Department6 dept = new Department6(d_id, d_name);
			empl[i] = new Employee6(e_id, e_name, e_salary, d, dept);
		}
//		for (int i = 0; i < empl.length; i++) {
//			System.out.println(" " + empl[i]);
//		}
        for(int i=0;i<empl.length-1;i++)
        {
        	for(int j=i+1;j<empl.length;j++)
        	{
        		if(empl[i].getDept().getD_name().equals(empl[j].getDept().getD_name()))
        		{    
        			System.out.println(empl[i]);
        			System.out.println(empl[j]);
        		}
        	}
        }
	}

}
