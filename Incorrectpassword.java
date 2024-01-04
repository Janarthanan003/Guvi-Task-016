package exception;

	@SuppressWarnings("serial")
	class Invalidpassword extends Throwable {
			 String username = "test";
		     String password = "password";    
	}
	public class Incorrectpassword {
		public Incorrectpassword(String password) {
			if (!password.equals("password")){			
			}			
		}
	}