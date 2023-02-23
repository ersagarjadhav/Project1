package feb18assignment;

import java.util.HashMap;
import java.util.TreeMap;

public class Q15 {

	public static void main(String[] args) {

		HashMap<Employee,String>hm=new HashMap<>();
		
		Dept d1=new Dept(1,"I.T");
		Dept d2=new Dept(1,"H.R");
		Dept d3=new Dept(1,"R.D");
		
		hm.put(new Employee(1,"Gaurav", 25000,d1), "pune");
		hm.put(new Employee(2,"Abhay", 20000,d3), "Mumbai");
		hm.put(new Employee(3,"Virat", 35000,d2), "Banglore");
		hm.put(new Employee(4,"sachin", 15000,d3), "Pune");
		hm.put(new Employee(5,"Rohit", 22000,d1), "Mumbai");
		hm.put(new Employee(6,"yuvi", 17000,d2), "pune");
		
		TreeMap<Employee,String>tm=new TreeMap<>(hm);
		System.out.println(tm);
		
		System.out.println("---------");
		
		TreeMap<Employee,String>ts=new TreeMap<>( new Q15_com() );
		ts.putAll(tm);
		System.out.println(ts);
	}

}
