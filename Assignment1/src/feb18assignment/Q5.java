package feb18assignment;

import java.util.HashMap;
import java.util.Map;

public class Q5 {

	public static void main(String[] args) {

		Map<Character, Integer> m=new HashMap<>();
		String s="pizzapan";
		char[] ch=s.toCharArray();
		for(char c:ch)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
		}
		for(Map.Entry e:m.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
