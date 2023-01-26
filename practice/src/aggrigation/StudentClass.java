package aggrigation;

public class StudentClass {

	int rollNum;
	String studentName;
	Address studentAddr;
	
	StudentClass(int rollNum,String studentName,Address studentAddr)
	{
		this.rollNum=rollNum;
		this.studentName=studentName;
		this.studentAddr=studentAddr;
	}
	
	public static void main(String[] args) 
	{
		
		Address ad=new Address(55,"Nashik","Maharashtra","India");
		
		StudentClass obj=new StudentClass(1,"sagar",ad);
		
		System.out.println(obj.rollNum);
		System.out.println(obj.studentName);
		System.out.println(obj.studentAddr.streetNum);
		System.out.println(obj.studentAddr.city);
		System.out.println(obj.studentAddr.state);
		System.out.println(obj.studentAddr.country);

		
	}

}
