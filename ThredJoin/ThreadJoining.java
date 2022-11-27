

public class ThreadJoining extends Runnable {
	Thread thread;
	ThreadJoining(String name) {
		thread = new Thread(this, name);
	}
	
	public void run() {
		printThreadInfo();
	}
	
	 void printThreadInfo() {
		for (int i=1; i<=4; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {				
			}
			System.out.println(thread.getName() + " : " + i);
			System.out.println(i);
		}
	}
}
