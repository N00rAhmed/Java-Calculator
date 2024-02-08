package firstjavaproject;
import java.util.Scanner; // import scanner class
import java.time.LocalDateTime;

public class Main {
	
	static int num1;
	static int num2;
	
	static void Addition() {
		int addition_calc = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + addition_calc);
	}
	
	static void Subtraction() {
		int subtraction_calc = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + subtraction_calc);
	}

	
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in); // creates scanner object
		
		LocalDateTime datetTime = LocalDateTime.now();
		System.out.println(datetTime);

		
		System.out.println("Enter num1: ");
		num1 = input.nextInt();		
		
		System.out.println("Enter num2: ");
		num2 = input.nextInt();
		
		
		System.out.println("choose a mathematical operator +, - : ");
		String operator =  input.next();

		switch(operator) {
		case "+":
			Addition();
			break;
			
		case "-":
			Subtraction();
			break;
		
		default:
			System.out.println("error invalid");
		}

	}

}

