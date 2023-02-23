package feb18assignment;

import java.util.ArrayList;

public class Q10Clear_Remove {

	public static void main(String[] args) {
			
			ArrayList<String> al=new ArrayList<>();
			al.add("Kunal");
			al.add("Samarth");
			al.add("Sidharth");
			
			System.out.println("1st ArrayList");
			System.out.println(al);
			
			ArrayList<String> al2=new ArrayList<>();
			al2.add("Sagar");
			al2.add("Omkar");
			al2.add("Pratik");
			al2.add("Kunal");
			al2.add("Samarth");
			al2.add("Sidharth");
			
			System.out.println("2nd ArrayList");
			System.out.println(al2);
			
			al2.removeAll(al);
			System.out.println("It Removing Comment Element between two ArrayList : \n"+al2);
			
			al.clear();
			System.out.println("It Clear All Elements : "+al);
		}

	}
