package com;

public class Example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=4,i;
      if(n==1|| n==0)
    	  System.out.println(n+" "+"Neither prime nor composite ");
      else 
      {    int flag=0;
    	  for(i=2;i<=n/2;i++)
    	  {
    		  if(n%i==0)
    		  {
    			  flag=1;
    			  System.out.println(n+" "+"Not a Prime number");
    			  break;
    		  }
    	  }
    	  if(flag==0)
    		  System.out.println(n+" "+"Prime number");
      }
	}

}
