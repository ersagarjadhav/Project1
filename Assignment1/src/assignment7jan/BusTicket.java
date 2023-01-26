package assignment7jan;

public class BusTicket {
	
private	int ticketNo;
private float ticketPrice;
private  float totalAmount;
 private   Person person;
 
 public void setticketNo(int ticketNo)
	{
		this.ticketNo=ticketNo;
	}
	
	public int getticketNo()
	{
		return ticketNo;
		
	}
	public void setticketPrice(float ticketPrice)
	{
		this.ticketPrice=ticketPrice;
	}
	
	public float getticketPrice()
	{
		return ticketPrice;
		
	}
	
	
	public void settotalAmount(float totalAmount)
	{
		this.totalAmount=totalAmount;
	}
	
	public float gettotalAmount()
	{
		return totalAmount;
		
	}
	
	
	public void setperson(Person person)
	{
		this.person=person;
	}
	
	public Person getperson()
	{
		return person;
		
	}
	
	
	public void calculateTotal()
	{
		if(person.getage()<=16)
		{
			
			settotalAmount(ticketPrice/2);
			
		}
		else if(person.getage()>=60)
		{
			settotalAmount(ticketPrice*75/100);
		}
		else if(person.getgender()=='f'||person.getgender()=='F')
		{
			 settotalAmount(ticketPrice*90/100);
		}
		else
        {
            settotalAmount(ticketPrice);
        }
		
	}
 
 
 
	

}
