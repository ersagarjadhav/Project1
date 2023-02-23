package feb18assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Student1
{
	String sName;
	String cName;
	
	public Student1(String sName, String cName) 
	{
		this.sName = sName;
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Student1 [sName=" + sName + ", cName=" + cName + "]";
	}
	
}

public class Q12InfoCourse {
	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
		
		HashSet<Student1> hs = new HashSet<>();
		
		
		hs.add(new Student1("Ram", "Software"));
		hs.add(new Student1("Om", "Testing"));
		hs.add(new Student1("Kiran", "ML"));
		hs.add(new Student1("Ajay", "Software"));
		hs.add(new Student1("Sagar", "ML"));
		hs.add(new Student1("Shree", "Software"));
		
		System.out.println("Enter course name you want to search");
		String course = sc.next();
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		Iterator<Student1> it = hs.iterator();
		
		ArrayList<String> al = new ArrayList<>();
		
		while(it.hasNext())
		{
			Student1 s = it.next();
	
			if(s.cName.equals(course))
			{
				al.add(s.sName);
			}
		}
		
		System.out.println("No of students are : "+al.size());
		System.out.println(al);
	}

}
