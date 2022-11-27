package bytestreams;
import java.io.*;

public class Bufferstreams  {

	static void readWriteFile() throws IOException {
		FileInputStream fis = new FileInputStream("input.txt");
		if (fis.available() == -1) {
			return;
		}
		BufferedInputStream bs = new BufferedInputStream(fis);

		FileOutputStream fos = new FileOutputStream("output.txt");
		BufferedOutputStream bo = new BufferedOutputStream(fos);
		
		byte b[] = new byte[20];
		while (bs.read(b) != -1) {
			System.out.println(new String(b));
			bo.write(b);
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
