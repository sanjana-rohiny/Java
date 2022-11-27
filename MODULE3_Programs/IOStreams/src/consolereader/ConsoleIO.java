package consolereader;
import java.io.*;
public class ConsoleIO {

	static void consoleRead() throws IOException {
	    char c = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters ....(q to quit)");
		while(c != 'q') {
			c = (char) br.read();
			System.out.println(c);
		}
		System.out.println("Exit...!");
	}
	
	static void readString() throws IOException {
	    String str = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter line ....(stop to quit)");
		do{
			str = br.readLine();
			System.out.println(str);
		} while(true != str.equalsIgnoreCase("stop"));
		System.out.println("Exit...!");
	}
	
	static void consoleWrite() throws IOException {	
		byte b[] = {65,66,67,68,69,70,71,72};
		int i = 65;
		/*
		 * System.out.write(b[0]); System.out.write(i);
		 * 
		 * System.out.write('A'); System.out.write('\n');
		 */
//		        OR 
		System.out.write('A');
		System.out.write('\n');

		//System.out.flush();
		
		 
		//byte bArr[] = {'G','e','n','è','s','e','-', 'D','i','e','u', 'a', 'c','r','é','é', 'l','e', 'c','i','e','l'};
		//String str = "Genèse - Dieu a créé le ciel et la terre";
		//System.out.write(str.getBytes(), 0,10);
	}
	
	public String toString() {
	      return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	
	public static void main (String[] args) {
		try {
			consoleWrite();
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
