package first;

class RunnableDemo implements Runnable{
	private Thread t;
	private String threadName;
	RunnableDemo(String name){
		threadName = name;
		System.out.println("Creating "+threadName);
	}
	public void run() {
		System.out.println("Running "+threadName);
		try {
			for(int i=4;i>0;i--)
			{
				System.out.println("Thread: "+threadName+", "+i);
				Thread.sleep(2000);
			}
		}catch (InterruptedException e) {
			System.out.println("Thread "+threadName+" interrupted");
		}
		System.out.println("Thread "+threadName+" exiting");
	}
	public void start() {
		System.out.println("Starting "+ threadName);
		if(t == null)
		{
			t = new Thread(this, threadName);
			t.start();
		}
	}
}

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo r1 = new RunnableDemo("Thread-1");
		r1.start();
		
		RunnableDemo r2 = new RunnableDemo("Thread-2");
		r2.start();
		
		

	}

}
