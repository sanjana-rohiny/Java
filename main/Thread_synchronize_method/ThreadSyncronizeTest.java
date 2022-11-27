

public class ThreadSyncronizeTest {

	public static void main(String[] args) {
		
		Callme target = new Callme();
		// TODO Auto-generated method stub
		ThreadSyncronize t1 = new  ThreadSyncronize(target, "Alice");
		ThreadSyncronize t2 = new  ThreadSyncronize(target, "Bob");
		ThreadSyncronize t3 = new  ThreadSyncronize(target, "Cindy");

		try {
			t1.thread.join();
			t2.thread.join();
			t3.thread.join();
		} catch (InterruptedException e) {}	
	}
}
