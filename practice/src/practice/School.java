package practice;
     // this is the encapsulation
class Student
{
    private int roll_no;
    
    public void setRoll_no(int roll_no1)
    {
    	roll_no=roll_no1;
    }
    
    public int getRoll_no()
    {
    	return roll_no;
    }
	
}







public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		s.setRoll_no(01);
		
		System.out.println(s.getRoll_no());

	}

}
