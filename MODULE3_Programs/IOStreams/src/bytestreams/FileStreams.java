package bytestreams;

import java.io.*;

public class FileStreams {

	static void readWriteFile() throws IOException {
		FileInputStream fis = new FileInputStream("input.txt");
		if (fis.available() == -1) {
			return;
		}
		
		FileOutputStream fos = new FileOutputStream("output.txt");
		
		byte b[] = new byte[20];
		while (fis.read(b) != -1) {
			System.out.println(new String(b));
			fos.write(b);
		}
		
	}
	
	public static void main (String[] a) {
		try {
			readWriteFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
