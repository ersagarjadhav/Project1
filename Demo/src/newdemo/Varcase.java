package newdemo;

public class Varcase {

	public static int m1 (int a,int b)
	{
		return a+b;
	}
	
	public static int m1(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public static int m1(int...arr)
	{
		int result=0;
		for(int a:arr)
		{
			result=result+a;
		}
		return result;
	}
	
	
	public static void main(String[] args) {

		Varcase obj=new Varcase();
		System.out.println(obj.m1(1,2,3,4,5,5,6,6,3,3));
		System.out.println(obj.m1(7,5,6,8,7,4,6,8));
		System.out.println(obj.m1(12, 10));
		System.out.println(obj.m1(1, 2, 3));
		
	}

}
