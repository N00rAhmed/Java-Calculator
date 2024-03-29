package firstjavaproject;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.InputMismatchException;

public class Main {

	static double num1;
	static double num2;
	static String operator;
	
	static Scanner input = new Scanner(System.in);
	
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
		
		while(true) {
			
			try {
				System.out.println("do you wanna restart the program y/n: ");
				String restart_option = input.next();

				if (restart_option.equals("y")) {
					calc();
					break; 
				}
				else if (restart_option.equals("n")) {
					System.out.println("bye 🙂");
					break; 
				}
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid input error not found, please try to enter y/n: ");
			input.next();
		}
		}
	}

	
    static void loadingAnimation() {
        try {
            System.out.print("Loading ");
            for (int i = 0; i < 10; i++) {
                Thread.sleep(200);
                System.out.print(". ");
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


	static void calc() {
				
		while(true) {
			try {
			System.out.println("Enter num1: ");
			num1 = input.nextDouble();
			break; 
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid input, please try to enter integer/double value: ");
			input.next();
		}
		}	
		
		while(true) {
			try {
				System.out.println("Enter num2: ");
				num2 = input.nextDouble();
				break;

			}catch(InputMismatchException e) {
				System.out.println("Invalid input, please try to enter integer/double value: ");
				input.next();

			}
		}
		
		
		System.out.println("Choose a Mathematical Operator +, -, /, * : ");
		operator =  input.next();
		
		
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
		loadingAnimation();
		
		LocalDateTime datetTime = LocalDateTime.now();
		System.out.println(datetTime);

		calc();
		
	}

}

