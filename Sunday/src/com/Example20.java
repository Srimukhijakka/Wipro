package com;

public class Example20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=1234,reverse=0;
         while(n!=0)
         {
        	 int digit=n%10;
        	 reverse=reverse*10+digit;
        	 n=n/10;
         }
         System.out.println(reverse);
	}

}
