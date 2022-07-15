
public class Ticket extends Thread {
	
		  String task;
		 
		  Ticket(String task)
		{
		  this.task = task;
		}
		public void run()
		{
		 for(int i = 1; i <= 5; i++)
		 {
		  System.out.println(task+ " : " +i); 	
		  try
		 {
		    Thread.sleep(1000); 
		 }
		 catch(InterruptedException ie) {
		   System.out.println(ie.getMessage());	
		  }
		 } 
		} 
		public static void main(String[] args) 
		{
		
			Ticket th1 = new Ticket("Cut the ticket"); 
			Ticket th2 = new Ticket("Show your seat number");
		  
		
		  Thread t1 = new Thread(th1);
		  Thread t2 = new Thread(th2);
		  t1.start();
		  t2.start();
		  }

}
