package com.jsp.stacks;

public class StringMatching 
{
	public static int cap,top=-1;
	static char StaticDS[];
	public static void push(char ele)
	{
		if(top==cap-1)
		{
			System.out.println("full");
		}
		else {
			top++;
			StaticDS[top]=ele;
		}
	}
	public static char pop()
	{
		if(top<=-1)
		{
			System.out.println("not balance");
			System.exit(0);
		}
		return StaticDS[top--];
	}
	public static void main(String[] args) 
	{
		String str="{[()]}}";
		cap=str.length();
		StaticDS=new char[cap];


		for(int i=0;i<cap;i++)
		{
			
			if(str.charAt(i)=='(' || str.charAt(i)=='['|| str.charAt(i)=='{')
			{
				push(str.charAt(i));
			}
			else {
				pop();
			}
		}
		if(top==-1)
		{
			System.out.println("balance");
		}
		else {
			System.out.println("not balance");
		}

	}

}
