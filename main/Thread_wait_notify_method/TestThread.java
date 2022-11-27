

public class TestThread implements Runnable {

	Thread thread;
	String name;
	boolean suspendFlag;
	
	public TestThread(String name) {
		this.name = name;
		thread = new Thread(this, name);
		suspendFlag = false;
		
		thread.start();
	}
	
	public void suspend_me() {
		suspendFlag = true;
	}
	
	synchronized void resume_me() {
		suspendFlag = false;
		notify();
	}
	@Override
	public void run() {
		try {
			int i = 0;
			while(true) {
				System.out.println(name + ": " + i++);
				Thread.sleep(1000);

				synchronized (this) {
					while(suspendFlag==true) {
						wait();
					}
				}
			}
		}catch(InterruptedException e) {}
		
		System.out.println(name + ": Exit...!");
	}

}
