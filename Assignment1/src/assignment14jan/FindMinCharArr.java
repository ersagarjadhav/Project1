package assignment14jan;

public class FindMinCharArr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr= {'A','D','E','x','z','R'};
		char min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			} 
		}
		System.out.println(min);
	}

}
