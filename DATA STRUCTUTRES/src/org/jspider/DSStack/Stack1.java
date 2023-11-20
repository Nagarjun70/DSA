package org.jspider.DSStack;

public class Stack1 
{
	int cap,top,stackDS[];
	
	public Stack1(int cap)
	{
		this.cap=cap;
		stackDS=new int[this.cap];
	}
	public void push(int ele)
	{
		if(isFull())
		{
			System.out.println("Satck is full");
		}else {
			top++;
			stackDS[top]=ele;
			
		}
	}
	public boolean isFull()
	{
		if(top==cap-1)
		{
			return true;
		}else {
			return false;
		}
	}
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}else {
			return false;
		}
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("statck is empty");
		}else {
			for(int i=0;i<cap;i++)
			{
				stackDS[i]=stackDS[i+1];
			}
			top--;
		}
	}
	public void dispaly()
	{
		if(isEmpty())
		{
			System.out.println("Satck is empty");
		}else {
			for(int i=0;i<cap;i++)
			{
				System.out.println(stackDS[i]);
			}
		}
	}
}
