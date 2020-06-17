package com;

public class Example16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i,j;
     for(i=10;i<=99;i++)
     {
    	 int flag=0;
    	 for(j=2;j<=i/2;j++)
    	 {
    		 if(i%j==0)
    		 {
    			 flag=1;
    			 System.out.println("Not a prime number");
    			 break;
    		 }
    	 }
    	 if(flag==0)
    	 {
    		 System.out.println("Prime number");
    	 }
     }
	}

}
