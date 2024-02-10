package firstjavaproject;
import java.util.Scanner; // import scanner class
import java.time.LocalDateTime;

public class Main {
	
	static double num1;
	static double num2;
	
	static Scanner input = new Scanner(System.in); // creates scanner object
	
	static void Addition() {
		var addition_calc = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + addition_calc);
	}
	
	static void Subtraction() {
		var subtraction_calc = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + subtraction_calc);
	}
	
	static void Division() { 
		var division_calc = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + division_calc);
	}
	
	static void Multiplication() { 
		var multiplication_calc = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + multiplication_calc);
	}

	
	static public void restart() {
		System.out.println("do you wanna restart the program y/n: ");
		String restart_option = input.next();
		
//		to compare strings use equals method and not == operator
		if (restart_option.equals("y")) {
			calc();
		}
		else if (restart_option.equals("n")) {
			System.out.println("bye");
		}
		else {
			System.out.println("error not found");
		}
	}
	

	static void calc() {
		
		System.out.println("Enter num1: ");
		num1 = input.nextInt();		
		
		System.out.println("Enter num2: ");
		num2 = input.nextInt();
		
		
		System.out.println("choose a mathematical operator +, -, /, * : ");
		String operator =  input.next();
		
		switch(operator) {
		case "+":
			Addition();
			break;
			
		case "-":
			Subtraction();
			break;
			
		case "/":
			Division();
			break;
		
		case "*":
			Multiplication();
			break;
		
		default:
			System.out.println("error invalid");
		}
		
		restart();
		
	}
	
	
	public static void main(String[] args) {
		
		LocalDateTime datetTime = LocalDateTime.now();
		System.out.println(datetTime);

		calc();
		
	}

}

