package logging_process_COR;

public class Client {

	public static void main(String[] args) {
		LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create the Logger and add commands
        Logger logger = new Logger();
        logger.addCommand(new LogCommand(infoHandler));
        logger.addCommand(new LogCommand(debugHandler));
        logger.addCommand(new LogCommand(errorHandler));

        // Process log messages
        logger.executeCommands("This is an info message.", LogLevel.INFO);
        logger.executeCommands("This is a debug message.", LogLevel.DEBUG);
        logger.executeCommands("This is an error message.", LogLevel.ERROR);
    }
}
