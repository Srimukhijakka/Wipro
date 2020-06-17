package com;

public class Example22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,arr[]= {1,2,3,4,5,6,7,8,9},sum=0;
    float average;
    for(i=0;i<arr.length;i++)
    {
    	sum=sum+arr[i];
    }
    average=sum/arr.length;
    System.out.println("Sum : "+sum+" "+"Average : "+average);
	}

}
