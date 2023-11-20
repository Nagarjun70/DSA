package com.jsp.recursion;

public class sum 
{
	public static int display(int n)
	{
		if(n==5)
		{
			return n;
		}
		return n+display(n+1);
	}

	public static void main(String[] args) 
	{
		
		int sum=display(1);
		System.out.println(sum);
		

	}

}
