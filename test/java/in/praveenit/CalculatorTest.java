package in.praveenit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		int actualResult = calc.add(20, 30);
		int expectedResult = 50;
		
		assertEquals(expectedResult, actualResult);
	}

}
