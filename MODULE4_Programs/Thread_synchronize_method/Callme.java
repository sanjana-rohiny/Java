

public class Callme {
	
	synchronized void printName(String name) {
		 System.out.print("[" + name);
		 try { Thread.sleep(1000);} catch(Exception e) {}
		 System.out.print("]");
	}
}
