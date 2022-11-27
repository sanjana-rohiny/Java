

public class FirstThreadTest {

	public static void main(String[] args) {
		int count = 0;
		FirstThread1 t1 = new FirstThread1("Rabbit");
		FirstThread1 t2 = new FirstThread1("Tortoise");
		FirstThread1 t3 = new FirstThread1("Fox");

		t1.thread.start();
		t2.thread.start();
		t3.thread.start();
		
		while(true) {
			System.out.println("main(): Count = " + count++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
		}
	}
	}

}
