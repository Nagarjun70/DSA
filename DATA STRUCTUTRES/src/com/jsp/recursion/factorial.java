package com.jsp.recursion;

public class factorial 
{
	public static int display(int n)
	{
		if(n==5)
			return n;
		return n*display(n+1);
	}

	public static void main(String[] args) 
	{
		int fact=display(1);
		System.out.println(fact);
		

	}

}
