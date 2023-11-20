package com.jsp.stacks;

import java.util.Scanner;

public class ReverseString 
{
	static char StackDS[];
	static int top=-1;
	public static int cap;
	
	public static void push(char ele)
	{
		if(top==cap-1)
		{
			System.out.println("stack is full");
		}else
		{
			top++;
			StackDS[top]=ele;
		}

	}
	public static char pop()
	{
		return StackDS[top--];
	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		String rev="";

		cap=str.length();
		StackDS=new char[cap];

		for(int i=0;i<cap;i++)
		{
			push(str.charAt(i));
		}
		while(top!=-1)
		{
			rev=rev+pop();
			System.out.println(rev+" ");
		}

	}

}
