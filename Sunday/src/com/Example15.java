package com;

public class Example15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,n=9,flag=0;
    if(n==0 || n==1)
    	System.out.println("Not a prime number");
    else
    {
    	for(i=2;i<=n/2;i++)
    	{
    		if(n%i==0)
    		{
    		flag=1;
    		System.out.println("Not a prime number");
    		break;
    		}
    	}
    	if(flag==0)
    		System.out.println("Prime number");
    }
    
    	
	}

}
