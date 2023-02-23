package book;

import java.util.ArrayList;
import java.util.Scanner;

class Bookimpl implements BookDao {

	Scanner in = new Scanner(System.in);
	boolean flag = false;
	Book b = null;
	ArrayList<Book> al = new ArrayList<Book>();
	
	@Override
	public boolean insert() {

		System.out.println("enter book id");
		int id = in.nextInt();
		System.out.println("enter book name");
		String b_name = in.next();
		System.out.println("book price");
		float price = in.nextFloat();
		
		b = new Book(id, b_name, price);
		al.add(b); //Inserting Element
		System.out.println(al);
		flag = true;
		return flag;
	}

	@Override
	public boolean update() {
        
		int b_id = 0;
		String b_name = null;
		float price = 0;
		
		for(int i=0;i<1;i++)
		{
		System.out.println("Which Book You Want to Update");
		for(Book x:al)
		{
			String s=x.getB_name();
			System.out.println(s);
		}
		//System.out.print(al);
		System.out.println("\nEnter Book Name");
		String name=in.next();
		boolean s=al.get(i).getB_name().equals(name);
		if(s==true)
		{
			System.out.println("What You Want To update");
			System.out.println("1.Update Book Id");
			System.out.println("2.Update Book Name");
			System.out.println("3.Update Book Price");
			System.out.println("4.Exit");
			System.out.println("Enter Your Choice");
			int details=in.nextInt();
			
			switch(details)
			{
			case 1:
			    {
					System.out.println("type New Book Id");
					int update = in.nextInt();
					b_id = update;
					Book b=al.get(i);
					b.setB_id(b_id);  
					al.set(i, b);     //Updating Element
				}
			    
			break;
			
			case 2:
				
				{
					System.out.println("Type New Book Name");
					String update_name = in.next();
					b_name = update_name;
					Book b=al.get(i);
					b.setB_name(b_name);
					al.set(i, b);//Updating Element
				}
				
			break;
			
			case 3:
				{
					System.out.println("Type New Book Price");
					float update_price = in.nextFloat();
					price = update_price;
					Book b=al.get(i);
					b.setPrice(price);
					al.set(i, b);   //Updating Element
				}
			break;

			default :
				System.out.println("Book Name Is Not Correct...!!!");
			}
			System.out.println(al);

			flag = true;
		}
	}
		return flag;
}

	@Override
	public boolean delete() {
		
		for(int i=0;i<al.size();i++)
		{
		System.out.println("Which Book You Want to Delete");
		for(Book x:al)
		{
			String s=x.getB_name();
			System.out.println(s);
		}
		System.out.println("\nEnter Book Name");
		String name=in.next();
		boolean s=al.get(i).getB_name().equals(name);
		if(s==true)
		{
			al.remove(i);
		}
		}
		flag = true;
		return flag;
	}

	@Override
	public boolean search() {

		boolean flag = false;
		
		for(int i=0;i<al.size();i++)
		{
		System.out.println("Search Your Book Here...");
		System.out.println("\nEnter Book Name");
		String name=in.next();
		
		if(al.contains(name));
		{
			flag = true;
		}
		}		
		return flag;
	}

	@Override
	public boolean show_Details() 
	{
		System.out.println(al);
		return true;
	}

	@Override
	public boolean exit()
	{
		System.out.println("Exit Succesfully...!!!");
		return true;
	}
}
