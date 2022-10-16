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
			writer.write("INFO: " + date.toString() + " - " + info);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void warning(String warning) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fatal(String fatal) {
		// TODO Auto-generated method stub
		
	}

}