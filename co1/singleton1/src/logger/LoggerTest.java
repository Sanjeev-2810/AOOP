package logger;



public class LoggerTest {

	public static void main(String[] args) {
		Logger1 logger = Logger1.getInstance();
        logger.log("This is a test message.");
        logger.log("Singleton pattern in action.");
    }
}
	
