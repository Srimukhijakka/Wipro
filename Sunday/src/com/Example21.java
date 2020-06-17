package com;

public class Example21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=110011,rev=0,tem;
		tem=n;
		while(n!=0)
		{
		int digit=0;
		digit=n%10;
		rev=rev*10+digit;
		n=n/10;
		}
		if(rev==tem)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
			

	}

}
