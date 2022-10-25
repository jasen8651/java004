package ncs.test06;

public class InvalidException extends RuntimeException{
	
	public InvalidException() {
		super();
	}
	
	public InvalidException(String message, Throwable casuse, boolean enablesupprseeion, boolean writable) {
		super(message, casuse, enablesupprseeion,writable);
	}
	public InvalidException(String message, Throwable casuse) {
		super(message,casuse);
	}
	public InvalidException(String message) {
		super(message);
	}
	public InvalidException(Throwable casuse) {
		super(casuse);
	}
	
	
}
