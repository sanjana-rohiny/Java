

public class ThreadSyncronizeTest2 {

	public static void main(String[] args) {
		Callme2 target = new Callme2();
		// TODO Auto-generated method stub
		ThreadSynchronize2 t1 = new  ThreadSynchronize2(target, "Alice");
		ThreadSynchronize2 t2 = new  ThreadSynchronize2(target, "Bob");
		ThreadSynchronize2 t3 = new  ThreadSynchronize2(target, "Cindy");

		try {
			t1.thread.join();
			t2.thread.join();
			t3.thread.join();
		} catch (InterruptedException e) {}	
	}

}
