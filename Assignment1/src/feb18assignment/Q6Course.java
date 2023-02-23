package feb18assignment;

import java.util.HashMap;

class Course {
	
	int c_id;
	String c_name;
	
	Course(int c_id, String c_name)
	{
		this.c_id=c_id;
		this.c_name=c_name;
	}
   @Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + "]";
	}
}
class Student {
	
	int roll_no;
	String s_name;
	Course c;
	
	public Student(int roll_no, String s_name, Course c) {
		super();
		this.roll_no = roll_no;
		this.s_name = s_name;
		this.c = c;
	}
	
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", s_name=" + s_name + ", c=" + c + "]";
	}
}



public class Q6Course {


	public static void main(String[] args) {

		Course c1=new Course(10, "C++");
		Course c2=new Course(20, "C#");
		Course c3=new Course(30, "Java");
		
		Student s1=new Student(1, "Kunal", c1);
		Student s2=new Student(1, "Karan", c2);
		Student s3=new Student(1, "Krishna", c3);

		
		HashMap<Course, Student> hs=new HashMap<>();
		hs.put(c1, s1);
		hs.put(c2, s2);
		hs.put(c3, s3);
		
		System.out.println(hs);

	}
}
