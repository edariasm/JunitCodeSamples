package ea.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils mathutils;
	
	@BeforeEach
	void initialize(){
		
		mathutils = new MathUtils();
		
	}

	@Test
	void testAdd() {
		//first create a new instance of the class to test
		
		int expected = 2;
		int actual = mathutils.add(1, 1);
		
		
		//use assertions to assure the result is the expected, or not. There is an argument to document the error if test fails
				
		assertEquals(expected, actual, "The exptected result is the sum of two numbers");
		
	}
	
	@Test
	void divideTes() {
		int a= 10;
		int b=0;
		
		
		// "() ->" is a lambda, meaning it provides a code that will execute something
		
		assertThrows(ArithmeticException.class, () -> mathutils.divide(a, b), "Divide by zero should throw an exception");
		
	}
	
	@Test
	void testComputedCircleArea() {
		double expectedArea = 314.1592653589793; 
		double actualArea = mathutils.ComputedCirleArea();
		
		assertEquals(expectedArea, actualArea, "The expected result of circle area with a radius of 10 is 314.1592653589793");
	}

}
