package string_Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	//Empty string
	@Test
	public void emptyStringReturnZero() {
		assertEquals(0,StringCalculator.add(""));
	}

	// one number
	@Test
	public void stringReturnOne() {
		assertEquals(1,StringCalculator.add("1"));
		//assertEquals(12,StringCalculator.add("12"));
	}

	//sum of numbers
	@Test
	public void StringReturnSumOfNumber() {
		assertEquals(3,StringCalculator.add("1,2"));
	}

}
