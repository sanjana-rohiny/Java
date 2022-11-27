

/*
 * MAX_PRIORITY : The maximum value is 10, kown as the maximum priority of a thread. 
 * NORM_PRIORITY : The normal value is 5, known as the normal priority of a thread. 
 * MIN_PRIORITY : The minimum value is 1, known as the minimum priority of a thread.
 */

public class ThreadOne implements Runnable {
	
	Thread thread;
	public ThreadOne(String threadName) {
		super();
		// TODO Auto-generated constructor stub
		thread = new Thread(this);
		thread.setName(threadName);
		System.out.println("ThreadOne()");
		System.out.println("state = " + thread.getState().toString());

	}

	public void start_me() {
		System.out.println("Rabbit():start()");
		thread.start();
	}

	@SuppressWarnings("deprecation")
	public void stop_me() {
		System.out.println("Rabbit():stop()");
		thread.stop();
		
	}
	
	public void suspend_me() {
		System.out.println("Rabbit():suspend()");
		thread.suspend();

	}

	public void resume_me() {
		System.out.println("Rabbit():resume()");
		thread.resume();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Rabbit():run()");
		System.out.println("state = " + thread.getState().toString());

		int count = 0;
		while(true) {
			
			System.out.println("Rabbit - count = " + count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			count++;
		}
	}
	
	public void test_function() {
		
		System.out.println("Thread - features");

		System.out.println("\tName = " + thread.getName());
		System.out.println("\tPriority = " + thread.getPriority());
		System.out.println("\tState = " + thread.getState());
		System.out.println("\tThread id = " + thread.getId());
	}
}
