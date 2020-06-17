package com;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char Var='a';
		if((Var>='a' && Var<='z')|| (Var>='A' && Var<='Z'))
			System.out.println("Alphabet");
		else if (Var>=0 && Var<=9)
			System.out.println("Digit");
		else
			System.out.println("Special Character");
			

	}

}
