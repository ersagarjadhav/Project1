package assignment7jan;

import java.util.Scanner;

public class BusMan {

	
	 public static BusTicket getTicketDetails()
	    {
	        BusTicket bt= new BusTicket();
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the ticket no:");
	        bt.setticketNo(sc.nextInt());
	        System.out.println("Enter the ticket price:");
	        bt.setticketPrice(sc.nextFloat());
	        return bt;
	    }
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        Person p= new Person();
        System.out.println("Enter the passenger name:");
        p.setname(sc.nextLine());
        System.out.println("Enter the gender (M or F / m or f): ");
        p.setgender(sc.next().charAt(0));
        System.out.println("Enter the age:");
        p.setage(sc.nextInt());
        BusTicket bt= getTicketDetails();
        bt.setperson(p);
        p= bt.getperson();
        System.out.println("Ticket no:"+bt.getticketNo());
        System.out.println("Passenger Name:"+p.getname());
        System.out.println("Price of a ticket : "+bt.getticketPrice());
        bt.calculateTotal();
        System.out.println("Total Amount : "+bt.gettotalAmount());
    
		

	}

}
