package firstjavaproject;
import java.util.Scanner; // importd scanner class
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
//			int addition_calc = num1 + num2;
//			System.out.println(num1 + " + " + num2 + " = " + addition_calc);
			Addition();
			break;
			
		case "-":
//			int subtraction_calc = num1 - num2;
//			System.out.println(num1 + " - " + num2 + " = " + subtraction_calc);
			Subtraction();
			break;
		
		default:
			System.out.println("error invalid");
		}


//		if (operator == "+") {
//			int addition_calc = num1 + num2;
//			System.out.println(num1 + " + " + num2 + " = " + addition_calc);
//		}
//		else if (operator == "-") {
//			int subtraction_calc = num1 - num2;
//			System.out.println(num1 + " - " + num2 + " = " + subtraction_calc);
//
//		}
//		else {
//			System.out.println("error not found");
//		}
//			
		
		
		
		
		
		
//		System.out.println("wtf");
		
//		LocalDateTime datetTime = LocalDateTime.now();
//		System.out.println(datetTime);
//		
//		Scanner myObj = new Scanner(System.in); // creates scanner object
//		System.out.println("Enter username: ");
//		String userName = myObj.nextLine(); // read user input
//		
//		System.out.println("Your UserName is " + userName + " COOL !!! :)");
		
		//make a calulcater in java that accepts user input and maybe also allows choice of operation
		//also maybe include a secret feature
	}

}
