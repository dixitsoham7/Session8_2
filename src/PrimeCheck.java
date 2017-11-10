/*Task is to find given number is prime or not by using thread class and runnable interface
 *Thread implements Runnable interface and uses run() method which performs action for thread
 *Program is implemented as follows : */

import java.util.Scanner;

class NewThread implements Runnable // class implements runnable interface according to the condition given
{
	Thread t1; // thread class instance
	int no1;
	NewThread() // default Constructor
	{
		no1=11 ;
	    t1=new Thread(this,"Prime number");	     
	    t1.start(); //Starting first thread
	}
	NewThread(int pam) // Parameterized Constructor with an integer parameter
	{
		no1=pam;
	    t1=new Thread(this,"Prime number");	    
	    t1.start(); //Starting first thread
	}
	
	//This method will be executed when this thread is executed
	public void run() 
	{   
		try 
		{
			int no=no1;
	        int count=0;
	        
	        //checking whether number is prime or not
	        
	        for(int i=2;i<=no/2;i++)     //loop for checking the number is prime or not
	        {
		         if(no%i==0)
		         {
			         count++;
			         break;
		         }
	        }
	         if(count==0)
	             System.out.println(no+" is a PRIME number");
	         else
	        	 System.out.println(no+" is not a PRIME number");
	 
		     Thread.sleep(1000);
		}
	    catch(InterruptedException e) //exception will be thrown when sleeping or waiting thread is interrupted
		{
	    	System.out.println("Exception");  //printing exception
		}
	}
}

public class PrimeCheck
{
	public static void main(String[] args) 
	{		
		int n;
		Scanner in = new Scanner(System.in); //creating object of scanner class
		System.out.print("Enter number : "); //inputting number
		n = in.nextInt(); //storing the input
		new NewThread(n);//Making an instance of the new thread class with integer as parameter

	}

}
