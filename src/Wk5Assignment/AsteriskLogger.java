package Wk5Assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String str) {
		String star = "***" + str + "***";
		
	}

	@Override
	public void Error(String str) {
		String stars = "*";
		System.out.println(star.repeat(str.length()) + 16);
		
	}

}
