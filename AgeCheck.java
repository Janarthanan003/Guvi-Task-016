package exception;

public class AgeCheck {
		public static void agecheck(int age) throws InvalidAgeException {
		if (age<18) {
			throw new InvalidAgeException("Invalid Age");
		}
		else{
			System.out.println("Valid age");
		}
		}
		public static void main(String []args)throws InvalidAgeException {
			agecheck(10);
		}
}