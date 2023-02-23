package feb18assignment;

import java.util.HashSet;

public class Q8Remove {
	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<>();
		hs.add("Monday");
		hs.add("Tuesday");
		hs.add("Wendsday");
		hs.add("Thursday");
		hs.add("Friday");
		hs.add("Saturday");
		hs.add("Sunday");
		
		boolean b1=hs.contains("Sunday");
		if(b1==true)
		{
			hs.remove("Sunday");
		}
		
		boolean b2=hs.contains("Saturday");
		if(b2==true)
		{
			hs.remove("Saturday");
		}
		
		System.out.println(hs);	
	}

}
