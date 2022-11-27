

public class ThreadSyncronize implements Runnable{
	Thread thread;
	Callme target;
	ThreadSyncronize(Callme target, String name) {
		this.target = target;
		thread = new Thread(this, name);
		thread.start();
	}
	
	public void run() {
		target.printName(thread.getName());
	}
}
