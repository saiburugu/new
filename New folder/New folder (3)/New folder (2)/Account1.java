package com.cp.ass1;

import java.util.Scanner;

public class Account1 extends Account
{
	Account1(int id, String name,float balance) {
		super(id, name, balance);
		
	}

  	
	public static void main(String args[])
	{
		Account1 a=new Account1(11, "Thiru",2000.00f);
		
		System.out.println("Initial Amount="+a.getBalance());
		System.out.println("ID="+a.getId());
		System.out.println("Name="+a.getName());
			System.out.println("\n");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your credit Amount");
			int cr=sc.nextInt();
			a.credit(cr);
			System.out.println("Enter Your Debit Amount");
			int db=sc.nextInt();
			a.debit(db);
			System.out.println("Enter Amount To Transfer");
			int tr=sc.nextInt();
			a.tranferTo(tr);
			System.out.println(a.toString());
			
	}
}
