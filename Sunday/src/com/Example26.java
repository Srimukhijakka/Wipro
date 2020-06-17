package com;

public class Example26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,temp=0,j;
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("the maximum element of given array is "+ a[a.length-1]);
		System.out.println("the second maximum element of given array is "+ a[a.length-2]);
		System.out.println("the minimum element of given array is "+ a[0]);
		System.out.println("the second minimum element of given array is "+ a[1]);
}

}
