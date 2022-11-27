package CharacterStream;

import java.io.*;
import java.io.IOException;

public class BufferedReaderTest {

	static void readWriteFile() throws IOException {
		FileReader fis = new FileReader("malayalam.txt");		
		BufferedReader reader = new BufferedReader(fis);
		
		FileWriter fos = new FileWriter("output.txt");
		BufferedWriter writer = new BufferedWriter(fos);

		char b[] = new char[20];
		while (reader.read(b) != -1) {
			System.out.println(new String(b));
			writer.write(b);
		}
	}

	public static void main (String[] args) {
		try {
			System.out.println("Character Stream");
			readWriteFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
