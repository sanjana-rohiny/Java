

public class ThreadJoin extends Thread{

	public void run() {
		
		for (int i=1; i<=4; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {				
			}
			System.out.println(i);
		}
	}
	
	public static void main (String[] str) {
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();
		
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
