

public class ThreadSynchronize2 extends Runnable{
	Thread thread;
	Callme2 target;
	ThreadSynchronize2(Callme2 target, String name) {
		this.target = target;
		thread = new Thread(this, name);
		thread.start();
	}
	
	public void run() {
		synchronized(target) {
			target.printName(thread.getName());
		}
	}
}
