import java.util.Date;

public class ConsoleLogger implements Logger {

	@Override
	public void info(String info) {
		Date date = new Date(); 
		System.out.println(date.toString() + "");
		
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


