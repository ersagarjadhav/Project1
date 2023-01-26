package assignment6;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj=new Student();
		System.out.println("---Student1---");
		
		obj.let( 1,"sagar");
		obj.display();

		System.out.println("---Student2---");
		Student obj1=new Student();
		obj1.let( 2,"roshan");
		obj1.display();
		
		
		System.out.println("---Student3---");
		Student obj3=new Student();
		obj3.let( 3,"mahesh");
		obj3.display();
		
	
	}

}
