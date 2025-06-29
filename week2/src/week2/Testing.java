package week2;

//import org.junit.Test;
import static org.junit.Assert.*;


import org.junit.Test;

public class Testing {
	
	 Calculator c = new Calculator();
	@Test
	public void testAdd() {
		assertEquals(5,c.add(2, 3));
	}
	@Test
	public void testDivideByZero() {
        c.divide(10, 0);
    }
	@Test
    public void testDivide() {
        assertEquals(2, c.divide(10, 5));
    }

}
