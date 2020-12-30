class A extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread is starting");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			}
		}
	}
}


class B extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread is running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
	
		A t1 = new A();
		B t2 = new B();
		
		t1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		
		}
		t2.start();
	}

}
