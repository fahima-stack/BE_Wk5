import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileLogger implements Logger{
 /*
  * Want it to write to a file rather than the console so create classes + instances of classes to help write to a file. 
  *
  */
	private BufferedWriter writer;
	
	public FileLogger() { //surrounded with try catch by hovering over FileLogger
		try {
			writer = new BufferedWriter(new FileWriter("logs.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	@Override
	public void info(String info) {
		Date date = new Date();
		try {
			writer.append("INFO: " + date.toString() + " - " + info);
			writer.newLine(); //writes to new line instead of on same line
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void warning(String warning) {
		Date date = new Date();
		try {
			writer.append("WARNING: " + date.toString() + " - " + warning);
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		try {
			writer.append("ERROR: " + date.toString() + " - " + error);
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

	@Override
	public void fatal(String fatal) {
		Date date = new Date();
		try {
			writer.append("INFO: " + date.toString() + " - " + fatal);
			writer.newLine(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void close() {
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	
}
