package feb18assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Std {
	
	int s_id;
	String s_name;
	String c_name;

	public Std(int s_id, String s_name, String c_name) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.c_name = c_name;
	}
	
	@Override
	public String toString() {
		return "Std [s_id=" + s_id + ", s_name=" + s_name + ", c_name=" + c_name + "]";
	}
	
}


public class Q9Two_Std_object {

	public static void main(String[] args) {
		Std s1=new Std(1, "Kunal", "MIT");
		Std s2=new Std(2, "Krishna", "VIT");
		Std s3=new Std(3, "Karan", "NIT");
		Std s4=new Std(1, "Kunal", "MIT");
		
		ArrayList<Std> al1=new ArrayList<>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s4);
		
		ArrayList<Std> al2=new ArrayList<>();
        al2.add(s1);
        al2.add(s2);
        al2.add(s4);
        
        Set<Std> s=new HashSet<>();
        s.add(s1);
        s.add(s2);
        s.add(s4);
        
        al1.retainAll(al2);
        System.out.println(al1);
        
        
	}

}
