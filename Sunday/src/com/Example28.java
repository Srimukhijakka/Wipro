package com;

public class Example28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12, 34, 12, 45, 67, 89};
		int i,temp=0,j,k;
		int size=a.length;
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					for(k=j;k<size-1;k++)
						a[k]=a[k+1];
					size--;
					j--;
				}
			}
		}
		for(i=0;i<size;i++)
			System.out.print(a[i] + " ");
		}
		}

