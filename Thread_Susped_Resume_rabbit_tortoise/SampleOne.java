

public class SampleOne {

	public static void main (String[] str) {
		ThreadOne rabbit = new ThreadOne("Rabbit");
		
		//rabbit.test_function();
		rabbit.start_me();

		
		int count = 0;
		while(true) {
			
			System.out.println("Tortoise() - count = " + count);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
			if (count == 10) {
				rabbit.suspend_me();
			}

			if (count == 20) {
				rabbit.resume_me();
			}

			if (count == 30) {
				rabbit.stop_me();
			}
			
			if (count == 40) {
				System.out.println("Tortoise() Exit..");
				return;
			}

		}
	}
}
