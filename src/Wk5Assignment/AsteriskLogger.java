package Wk5Assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String str) {
		String star = "***" + str + "***";
		System.out.println(star);
	}

	@Override
	public void Error(String str) {
		String star = "***" + "Error:" + str + "***";
		String stars = "*".repeat(star.length());
		
		System.out.println(stars);
		System.out.println(star);
		System.out.println(stars);
	}

}
