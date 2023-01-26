package assment31_dec;

import java.util.Scanner;

public class Account {

		String name;
		String acc_no;
		int balance;
		
		public void insert()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter account holder name");
			name = sc.nextLine();
			
			System.out.println("Enter account number");
			acc_no = sc.next();
			
			System.out.println("Enter the initial amount");
			balance = sc.nextInt();
		}
		
		public void display()
		{
			System.out.println("Account holder name is : "+name);
			System.out.println("Account number is : "+acc_no);
			System.out.println("Account balance is : "+balance);
		}
		
		public void deposit()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the amount to be deposite");
			int deposit = sc.nextInt();
			
			balance = balance + deposit;
		}
		
		public void withdraw()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the amount to be withdraw");
			int withdraw = sc.nextInt();
			
			if(withdraw > balance)
			{
				System.out.println("Insufficient balance");
				return;
			}
			else
			{
				balance = balance - withdraw;
			}
			
		}
		
		public void check_balance()
		{
			System.out.println("Your account balance is : "+balance);
		}
	}
