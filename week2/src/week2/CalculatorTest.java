package week2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.*;

public class CalculatorTest {
	private Calculator c;

	
	@Before
	public void setUp() {
	System.out.println("Setting up before test");
	c=new Calculator();
	}
	@After
	public void tearDown() {
		System.out.println("Cleaning up after test..");
		c=null;
		}
	@Test
	 public void testAdd() {
        // Arrange
        int a = 3;
        int b = 4;

        // Act
        int result = c.add(a, b);

        // Assert
        assertEquals(7, result);
    }
	 @Test
	    public void testSquare() {
	        // Arrange
	        int input =9;

	        // Act
	        int result = c.square(input);

	        // Assert
	        assertEquals(81, result);
	    }
	
	

}
