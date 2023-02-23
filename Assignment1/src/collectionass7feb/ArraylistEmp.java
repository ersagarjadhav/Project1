package collectionass7feb;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArrayList<Employee> al =new ArrayList<>();
	Employee e1=new Employee(1, "Sachin", 5000);
		al.add(e1);
		al.add(new Employee(2,"Sagar",25000));
		al.add(new Employee(3,"Ajay",8000));
		al.add(new Employee(4,"Sachin",9000));
		al.add(new Employee(5,"Nilesh",11000));
		al.add(new Employee(6,"Mahesh",25000));
		
		Iterator<Employee>It=al.iterator();
		
		while(It.hasNext())
		{
			Employee s=It.next();
			if(s.salary>10000)
			{
				System.out.println("\n salary is greater then 10000");
			System.out.println(s);
			}
			
			if(s.name.equals("Sachin"))
			{
				System.out.println("\n Employee name is sachin");
				System.out.println(s);
			}
				
		}
	}

}
