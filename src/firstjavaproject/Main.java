package firstjavaproject;
import java.util.Scanner; // import scanner class
import java.time.LocalDateTime;

public class Main {
	
	static int num1;
	static int num2;
	
	static Scanner input = new Scanner(System.in); // creates scanner object
	
	static void Addition() {
		int addition_calc = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + addition_calc);
	}
	
	static void Subtraction() {
		int subtraction_calc = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + subtraction_calc);
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
		
		restart();
		
	}
	
	
	public static void main(String[] args) {
		
		LocalDateTime datetTime = LocalDateTime.now();
		System.out.println(datetTime);

		calc();
		
	}

}

