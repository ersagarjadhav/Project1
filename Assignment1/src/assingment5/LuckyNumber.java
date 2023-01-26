package assingment5;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  int sum=0;

    Scanner sc= new Scanner (System.in);
  System.out.print("Enter the car no:");
    int num = sc.nextInt();

if(num<1000 || num>9999)
    {
    System.out.println(num+" is not a valid car number");
    }
   else
   {
    while(num!=0)
     {
      int l=num%10;
      sum=sum+l;
     num=num/10;
     }
   if(sum%3==0||sum%5==0||sum%7==0)
    {
  System.out.println("Lucky Number");
  }
else
  {
  System.out.println("Sorry its not my lucky number");
 }

}

}

}