package com.jsp.singlelinkedlist;
class Node{
	int data;
	Node add;
	Node(int data)
	{
		this.data=data;
	}
}
public class singlelinkedlist 
{
	static Node root;
	
	public static void insert(int ele)
	{
		Node n=new Node(ele);
		if(root==null)
		{
			root=n;
		}else {
			
			Node last=root;
			
			while(last.add!=null)
			{
				last=last.add;
			}
			last.add=null;
		}
			
	}
	public static void delete(int index)
	{
		if(root==null)
		{
			System.out.println("no nodes");
		}
		else if(index==0)
		{
			deletebeg();
		}
		else if(index==size()-1)
		{
			delete();
		}
		else if(index>=size()||index<0)
		{
			System.out.println("invalid index value");
		}
		else {
			Node prev=root,curr=root;
			int x=0;
			while(x<index)
			{
				prev=curr;
				curr=curr.add;
				x++;
			}
			prev.add=curr.add;
			curr.add=null;
		}
	}
	public static void  delete()
	{
		if(root==null)
		{
			System.out.println("no nodes");
		}
		else if(root.add==null)
		{
			root=null;
		}
		else {
			Node last=root;
			while(last.add.add!=null)
			{
				last=last.add;
			}
			last.add=null;
		}
	}
	public static void deletebeg()
	{
		if(root==null)
		{
			System.out.println("no nodes");
		}else if(root.add==null)
		{
			root=null;
		}else {
			Node temp=root;
			root=root.add;
			temp.add=null;
		}
	}
	public static void display()
	{
		if(root==null)
		{
			System.out.println("ll is empty");
		}else {
			Node temp=root;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.add;
			}
		}
	}
	public static int size()
	{
		int count=0;
		if(root==null)
		{
			return 0;
		}else {
			Node temp=root;
			while(temp!=null)
			{
				count++;
				temp=temp.add;
			}
			return count;
		}
	}
	public static void main(String[] args) 
	{
		
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		insert(60);
		display();
		System.out.println(size());

		

	}

}
