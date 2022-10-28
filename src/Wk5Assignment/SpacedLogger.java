package Wk5Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String str) {
		String space = "";  
		for(int i = 0; i < str.length(); i++)
		{
			space += str.charAt(i);
			space += " "; 
		}
		System.out.println(space);
	}
	
	@Override
	public void Error(String str) {
		String x = "Error: "; 
		System.out.print(x);
		Log(str);
		
	}

}
