package feb18assignment;

import java.util.Comparator;

public class Q15_com implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.d.name.equals(o2.d.name))
		{
			if(o1.salary>o2.salary)
				return 1;
			else if(o1.salary<o2.salary)
				return -1;
			else
			return 0;		
		}
		return 0;
		
	}
}