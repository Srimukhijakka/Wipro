package com;

public class Example18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int sum,n=1234;
     for(sum=0;n!=0;n=n/10)
     {
    	 sum=sum+n%10;
     }
     System.out.println(sum);
	}

}
