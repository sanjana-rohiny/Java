

public class SuspendResume {

	public static void main(String[] args) {
		TestThread ob1 = new TestThread("One");
		TestThread ob2 = new TestThread("Two");
		
		try {
			Thread.sleep(5000);
			ob1.suspend_me();
			System.out.println("Suspending thread One");
			
			Thread.sleep(5000);
			ob1.resume_me();
			System.out.println("Resume thread One");
			
			Thread.sleep(5000);
			ob2.suspend_me();
			System.out.println("Suspending thread two");

			Thread.sleep(5000);
			ob2.resume_me();
			System.out.println("Resume thread Two");
			
			Thread.sleep(2000);
			ob1.thread.stop();;
			ob2.thread.stop();
			
			System.out.println("Stop Two");
			System.out.println("Stop one");

			

		} catch (InterruptedException e) { }
	}
}
