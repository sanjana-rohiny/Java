

public class ThreadJoinTest {
	
	public static void main(String[] args) {
		ThreadJoining t1 = new ThreadJoining("Alice");
		ThreadJoining t2 = new ThreadJoining("Bob");
		ThreadJoining t3 = new ThreadJoining("Cindy");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
		}
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
		}
		t3.start();
		
	}
}
