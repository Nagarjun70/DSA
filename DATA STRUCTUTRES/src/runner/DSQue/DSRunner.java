package runner.DSQue;

import org.jspiders.DSQue.Quee;

public class DSRunner {

	public static void main(String[] args) 
	{
		Quee q1=new Quee(5);
		q1.enQue(10);
		q1.enQue(20);
		q1.enQue(30);
		q1.enQue(40);
		q1.enQue(50);
		q1.enQue(60);
		q1.display();
		
		System.out.println("Second Quee");
		
		Quee q2=new Quee(5);
		q2.enQue(10);
		q2.enQue(20);
		q2.enQue(30);
		q2.enQue(40);
		q2.enQue(50);
		q2.enQue(60);
		
		q2.display();
	

	}

}
