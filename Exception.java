package exception;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {           
            System.out.print("Enter the first integer: ");
            int numerator = sc.nextInt();            
            System.out.print("Enter the second integer: ");
            int denominator = sc.nextInt();
            double result = (numerator/denominator);          
            System.out.println("Result of division: "+ result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error");
        } 
        finally {
            sc.close(); 
        }
        int denominator = 0;
		if (denominator == 0) {         
        }
    }
}