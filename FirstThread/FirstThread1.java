

public class FirstThread1 extends Thread {
	Thread thread;
	public FirstThread1(String name) {
		super();
		thread = new Thread(this, name);
	}

	@Override
	public void run() {
		int count = 0;
		while(true) {
			System.out.println(thread.getName() +"  Count = " + count++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}

}
