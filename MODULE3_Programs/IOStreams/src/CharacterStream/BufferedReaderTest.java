package CharacterStream;

import java.io.*;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		try {
			System.out.println("Character Stream");
			FileReader fis = new FileReader("malayalam.txt");
			BufferedReader reader = new BufferedReader(fis);

			FileWriter fos = new FileWriter("c_output.txt");
			BufferedWriter writer = new BufferedWriter(fos);

			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				writer.write(line);
			}
			
			writer.close();
			fos.close();
			
			reader.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
