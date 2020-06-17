package com;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=args.length;
		if(k==0)
		{
		System.out.println("No values");
		}
		else
		{
		for(int i=0;i<k;i++)
		{
		if(i!=k-1)
		System.out.print(args[i]+",");
		else
		System.out.print(args[i]);
		}
		}

	}

}
