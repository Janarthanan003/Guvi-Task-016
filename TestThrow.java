package exception;

@SuppressWarnings("serial")
class InvalidAgeException extends Throwable {	
	public InvalidAgeException(String str) {		
		super(str);
	}
}