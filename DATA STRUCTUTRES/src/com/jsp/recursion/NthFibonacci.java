package com.jsp.recursion;

public class NthFibonacci
{
	public static int fibonacci(int n)
	{
		if (n >= 1)
            return n*fibonacci(n- 1);
        else
            return 1;
		
		
	}
	public static void main(String[] args) 
	{
		int f=fibonacci(6);
		System.out.println(f);

	}

}
