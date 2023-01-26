package stringbuffer;

public class StringBufferMutable {

	public static void main(String[] args) {

		StringBuffer s=new StringBuffer("hello");
		
		s=s.append("java");
		
		System.out.println(s);
		
		System.out.println(s.hashCode());
		System.out.println(s.length());
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.insert(5, "Coding"));
	}

}
