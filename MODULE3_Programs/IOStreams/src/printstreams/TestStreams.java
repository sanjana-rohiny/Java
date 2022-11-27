package printstreams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestStreams {
	
	public static void main(String[] args) throws IOException {
		
		// if flag = true -> automatically flushable, 
		// that is no need to call flush()
		PrintWriter pw = new PrintWriter(System.out, false);
		pw.println("Hi How are you");
		pw.flush();
		
		// irrespective of flasg, 
		// must call flush() to output to console
		PrintStream ps = new PrintStream(System.out, true);
		ps.write('a');
		ps.flush();
	}
}
