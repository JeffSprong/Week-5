
public class App {

	public static void main(String[] args) {
		
		Logger Asterisklogger = new AsteriskLogger();
		
		Asterisklogger.log("Hello");
		Asterisklogger.error("Hello");
	

		Logger Spacedlogger = new SpacedLogger();
		
		Spacedlogger.log("Goodbye");
		Spacedlogger.error("Goodbye");
	}	
}
