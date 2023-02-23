package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		BookDao b=new Bookimpl();
		ArrayList<Bookimpl> al=new ArrayList<>();
		int choice;
		do {
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Search");
			System.out.println("5.Show_Datails");
			System.out.println("6.Exit");

			System.out.println("Enter Your Choice");
			choice=in.nextInt();
			
			switch(choice)
			{
			
			case 1:
				boolean b1=b.insert();
				if(b1==true)
				{
					System.out.println("Record Inserted Succesfully");
				}

				break;
			
			case 2:
				boolean b2=b.update();
				if(b2==true)
				{
					System.out.println("Record Updated Succesfully");
				}	
			break;
				
			case 3:
				boolean b3=b.delete();
				if(b3==true)
				{
					System.out.println("Deleted Succesfully");
				}
			break;
			
			case 4:
				boolean b4=b.search();
				if(b4==true)
				{
					System.out.println("Book Is Available");
				}
				else
				{
					System.out.println("Book Is Not Available");
				}
			break;
				
			case 5:
				
				 System.out.println("Available Books Details");
			     boolean b5=b.show_Details();	
			     
			break;
				
			case 6:
			    boolean b6=b.exit();
				System.out.println("Thank You...!!!");
				break;
			}
		}while(choice != 6);
	}
}

