package org.jspiders.DSQue;

public class Quee 
{
	int cap,front,rear,Que[];
	public Quee(int cap)
	{
		this.cap=cap;
		 Que=new int[this.cap];
	}
	public boolean isFull()
	{
		if(rear==cap)
		{
			return true;
		}else {
			return false;
		}
	}
	public boolean isEmpty()
	{
		if(front==rear)
		{
			return true;
		}else {
			return false;
		}
	}
	public  void enQue(int ele)
	{
		if(isFull())
		{
			System.out.println("Que is full");
		}
		else {
			Que[rear]=ele;
			rear++;
		}
	
	}
	public void deQue()
	{
		if(isEmpty())
		{
			System.out.println("Quee is empty");
		}
		else {
			for(int i=0;i<rear-1;i++)
			{
				Que[i]=Que[i+1];
			}
			rear--;
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Quee is empty");
		}else {
			for(int i=0;i<rear-1;i++)
			{
				System.out.println(Que[i]);
			}
		}
	}

}
