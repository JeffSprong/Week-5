
public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {

	String string = "***Error: " + error + "***";
	
	StringBuilder sb = new StringBuilder();
	
	for (int i = 0; i < string.length(); i++) {
		sb.append("*");
	}
	
	System.out.println(sb.toString());
	System.out.println(string);
	System.out.println(sb.toString());
	
	}

}
