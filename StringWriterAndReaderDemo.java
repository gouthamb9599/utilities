package demo.utilities;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringWriterAndReaderDemo {
	public void stringReaderMethod() {
		String input = "This is an example of StringReader.";
		StringReader stringReader = new StringReader(input);
		int c;
		try {
			System.out.println(stringReader.ready());//to check if it is ready to use
			System.out.println(stringReader.markSupported());//to check mark is supported
			stringReader.mark(0);//marks the first character
			System.out.println((char)stringReader.read());
			stringReader.reset();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			
			while ((c = stringReader.read()) != -1) {//read function
//				System.out.println(c);
				if(c==105) {
					stringReader.skip(2);//skips characters
					System.out.print((char) c);
				}
				System.out.print((char) c);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void stringWriterMethod() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.write("This is an example ");
		stringWriter.write("of StringWriter.");
		stringWriter.append('x');//append single character
		System.out.println(stringWriter.toString());
		stringWriter.append("charactersequence");
		System.out.println(stringWriter.toString());
		stringWriter.append("added with start and end points",3,7);
		System.out.println(stringWriter.toString());
		 StringBuffer buf= stringWriter.getBuffer();
		System.out.println("buffered: "+buf.toString());//converted to buffer
		
		// Convert writer to String
//		System.out.println(stringWriter.toString());
	}
	public static void main(String[] args) {
		StringWriterAndReaderDemo str = new StringWriterAndReaderDemo();
//		str.stringReaderMethod();
		str.stringWriterMethod();
	}
}
