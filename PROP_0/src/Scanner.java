import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scanner implements IScanner {
	public static final char NULL = (char)0;
	public static final char EOF = (char)-1; // End of file.

	private FileInputStream stream = null;
	private InputStreamReader reader = null;
	private char current = NULL;
	
	public Scanner() { }
	
	public void open(String fileName) throws IOException {
		stream = new FileInputStream(fileName);
		reader = new InputStreamReader(stream);
	}
		
	public char current() {
		return current;
	}
	
	public void moveNext() throws IOException {
		if (reader == null) {
			throw new IOException("No open file.");
        }
        if (current != EOF)
            current = (char)reader.read();
    }
	
	public void close() throws IOException {
		if (reader != null)
			reader.close();
		if (stream != null)
			stream.close();
	}
}
