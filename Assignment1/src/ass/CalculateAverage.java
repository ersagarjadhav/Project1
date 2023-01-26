package ass;

public class CalculateAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sub1=74;
		int sub2=65;
		int sub3=67;
		int sub4=88;
		int sub5=70;
		
		double total =sub1+sub2+sub3+sub4+sub5;
		double avg = total/5;
		double percentage= (total / 500)*100;

		System.out.println("All subject total is .."+total);
		
		
		
		System.out.println("The Average is ...."+avg);
	
		System.out.println("The Percentage is..."+percentage);
		
		if(percentage >=90) 
		{
			System.out.println("The person have A+ grade");
		}
		
		else if((percentage>=80) && ( percentage<=89))
		{
			System.out.println("The person have  A grade");
		}
		
		else if ((percentage >=70) && (percentage<=79))
		{
			
			System.out.println("The person have B grade");
		}
		
		else 
		{
			System.out.println("The person have  C Grade");
		}
		
		

	}

}
