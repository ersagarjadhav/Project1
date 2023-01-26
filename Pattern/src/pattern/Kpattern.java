package pattern;

public class Kpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
		int x=n/2+1;
		 
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n/2+1;j++)
			{
				if(j==1||j==x)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.println(" ");
				}
			}
			
			if(i<=n/2)
			{
				x--;
			}
			else
			{
				x++;
			}
			System.out.println();
		}
	}

}
