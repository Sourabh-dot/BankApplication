package com.Banking.App;
//OBJECT IMPLEMENTATION LAYER1
import java.util.Scanner;


public class Application implements Banking
{
	private String customer_name;
	private long customer_id;
	private double    balance;
	private double transaction;

	public Application(String cname,long cid)
	{
		this.customer_id=cid;
		this.customer_name=cname;
	}
	@Override
	public void Deposit(double amount) 
	{
		if(amount!=0)
		{
			balance = balance + amount;
			System.out.println("Amount Deposited");
			transaction = amount;
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}

	@Override
	public void WithDraw(double amount) 
	{
		if(amount!=0&&balance>amount)
		{
			balance = balance-amount;
			System.out.println("Amount Withdrawn");
			transaction = -amount;
		}
		else
		{
			System.out.println("Invalid Amount / Insufficient Balance");
		}
	}

	@Override
	public void TransactionDetails() 
	{
		if(transaction>0)
		{
			System.out.println("Deposit Amount : "+balance);
		}
		else if(transaction<0)
		{
			System.err.println("Withdraw Amount : "+Math.abs(balance));
		}
		else
		{
			System.out.println("No Previous Transactions to display");
		}
	}
	public void BankMenu()
	{
		char opt='\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome To ABC Bank");
		System.out.println();
		System.out.println("Customer Name         : "+customer_name);
		System.out.println("Customer ID           : "+customer_id);
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction Details");
		System.out.println("E. Exit");
		
		
		do {
			System.out.println("*******************************************");
			System.out.println("Enter Option : ");
			System.out.println("*******************************************");
			opt = scanner.next().charAt(0);
			System.out.println();
			
			switch(opt)
			{
			case 'A':
				System.out.println("_______________________________________");
				System.out.println("Current balance : "+balance);
				System.out.println("_______________________________________");
				break;
			case 'B':
				System.out.println("_______________________________________");
				System.out.println("Enter Deposit Amount : ");
				System.out.println("_______________________________________");
				try 
				{
				double deposit_amt = scanner.nextDouble();
				Deposit(deposit_amt);
				}
				catch(Exception e)
				{
					System.out.println("Enter valid Amount");
					break;
				}
				System.out.println("_______________________________________");
				break;
			case 'C':
				System.out.println("_______________________________________");
				System.out.println("Enter Withdraw Amount : ");
				System.out.println("_______________________________________");
				try 
				{
				double withdraw_amt = scanner.nextDouble();
				WithDraw(withdraw_amt);
				}
				catch(Exception e)
				{
					System.out.println("Enter Valid Amount");
					break;
				}
				System.out.println("_______________________________________");
				break;
			case 'D':
				System.out.println("_______________________________________");
				TransactionDetails();
				System.out.println("_______________________________________");
				break;
			case 'E':
				System.out.println("#######################################");
				break;
			default:
				System.out.println("Invalid Option. Please Enter valid Option");
				break;
			}
		}while(opt!='E');
		System.out.println("Thank you for choosing ABC :-)");
	}
	
}
