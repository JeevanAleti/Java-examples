class C implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Thread using Runnable");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class D implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Thread is started using runnable interface");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	}
public class ThreadDemo2 {


	public static void main(String[] args) {
		
		Runnable obj1 = new C();//runnable interface only supports run() method
		Runnable obj2 = new D(); 
		
		Thread t3 = new Thread(obj1);
		Thread t4 = new Thread(obj2);
		
		//runnable interface doesn't support start() method, so we have to create thread objects 
		//and link the objects(obj1 & obj2) of runnable interface/methods to threads
		
		t3.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		
		t4.start();
		
		

	}
	
}
