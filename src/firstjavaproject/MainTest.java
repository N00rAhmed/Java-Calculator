/**
 * 
 */
package firstjavaproject;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class MainTest {

	/**
	 * Test method for {@link firstjavaproject.Main#Addition()}.
	 */
	@Test
	void testAddition() {
//		fail("Not yet implemented");
        // Arrange
        Main.num1 = 5;
        Main.num2 = 8;

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Act
        Main.Addition();

        // Assert
        double expectedSum = 5 + 8;
        assertEquals("5.0 + 8.0 = " + expectedSum, outputStreamCaptor.toString().trim());
		
	}

	/**
	 * Test method for {@link firstjavaproject.Main#Subtraction()}.
	 */
	@Test
	void testSubtraction() {
//		fail("Not yet implemented");

        // Arrange
        Main.num1 = 11;
        Main.num2 = 2;

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Act
        Main.Subtraction();

        // Assert
        double expectedSum = 11 - 2;
        assertEquals("11.0 - 2.0 = " + expectedSum, outputStreamCaptor.toString().trim());

	}

	/**
	 * Test method for {@link firstjavaproject.Main#Division()}.
	 */
	@Test
	void testDivision() {
//		fail("Not yet implemented");
		
        // Arrange
        Main.num1 = 18;
        Main.num2 = 2;

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Act
        Main.Division();

        // Assert
        double expectedSum = 18 / 2;
        assertEquals("18.0 / 2.0 = " + expectedSum, outputStreamCaptor.toString().trim());

		
		
	}

	/**
	 * Test method for {@link firstjavaproject.Main#Multiplication()}.
	 */
	@Test
	void testMultiplication() {
//		fail("Not yet implemented");
		
        // Arrange
        Main.num1 = 2;
        Main.num2 = 3;

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Act
        Main.Multiplication();

        // Assert
        double expectedSum = 2 * 3;
        assertEquals("2.0 * 3.0 = " + expectedSum, outputStreamCaptor.toString().trim());

	}

	/**
	 * Test method for {@link firstjavaproject.Main#restart()}.
	 */
	@Test
	void testRestart() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link firstjavaproject.Main#loadingAnimation()}.
	 */
	@Test
	void testLoadingAnimation() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link firstjavaproject.Main#calc()}.
	 */
	@Test
	void testCalc() {
		fail("Not yet implemented");
	}

}
