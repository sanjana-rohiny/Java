package networking;

public class WriteThread implements Runnable {
	Thread writeThread;
	public WriteThread() {
		super();
		// TODO Auto-generated constructor stub
		
		writeThread = new Thread(this, "Write Thread");
		writeThread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
