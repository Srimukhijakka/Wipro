package com;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		char c;
		if(ch>='a'&&ch<='z')
		{
			c=Character.toUpperCase(ch);
			
		}
		else
		{
			c=Character.toLowerCase(ch);
		}
		System.out.println(ch+ " -> "+c);
  }

}
