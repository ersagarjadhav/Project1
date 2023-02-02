package newdemo;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {

		String str="my name is sagar jadhav";
				//ym eman si r
   
		String rev=new StringBuffer(str).reverse().toString();
		
		String[]res=str.split(" ");
		
   System.out.println(Arrays.toString(res));

		System.out.println(rev);
		
	}

}
