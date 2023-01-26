package string21jan;

public class Palindrom {
	void palindrome() {
		String s="mom";
		String reverce="";
		
		char ch []=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			reverce=reverce+ch[i];
		}
		if(reverce.equalsIgnoreCase(s))
		{
			System.out.println("Given string is pelindrome");
		}else
			System.out.println("Given string is not pelindrome");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrom  c=new Palindrom ();
		
		c.palindrome();

	}

}
