package assreturn;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Book obj=new Book();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the book name ");
            String a=sc.next();
            obj.setBookName(a);
            
            System.out.println("Enter the book price");
            int b=sc.nextInt();
            obj.setBookPrice(b);
            
            System.out.println("Enter the book Auther");
            String c=sc.next();
            obj.setautherName(c);
            
            
            System.out.println("--------Book Details-----------");
            System.out.println("Book name is .."+obj.getBookName());
            System.out.println("Book Price is.."+obj.getBookPrice());
            System.out.println("Auther Name is..."+obj.getautherName());
	}

}
