package CharacterStream;
import java.io.*;

public class FileIO {
	static void readWriteFile() throws IOException {
		FileReader fin = new FileReader("malayalam.txt");
		FileWriter fout = new FileWriter("output.txt");
		
		char arr[] = new char[20];
		
		while(fin.read(arr) != -1) {
			System.out.println(new String(arr));
			fout.write(arr);
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
