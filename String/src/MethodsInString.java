
public class MethodsInString {

	static void findLen(char ch[])
	{
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
			count++;
			
		}
		System.out.println(" "+count);
		
	}

	public static void main(String[] args) {
		String s="hello";
		char ch[]=s.toCharArray();
		
		findLen(ch);
		
		
	}

}
