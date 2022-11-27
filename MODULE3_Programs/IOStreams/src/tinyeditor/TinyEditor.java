package tinyeditor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEditor {
	static void tinyEditor() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a line of text");
		System.out.println("Enter a quit to stop");

		String str[] = new String[100];
		for (int i=0; i<100; i++) {
			str[i] = br.readLine();
			if (str[i].equalsIgnoreCase("quit") == true) {
				break;
			}
		}
		System.out.println("Exit...!");
	}
	
	public static void main (String[] args) {
		try {
			tinyEditor();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
