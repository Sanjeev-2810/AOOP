package logging_process_COR;

public interface Command {
	void execute(String message, LogLevel level);
}
