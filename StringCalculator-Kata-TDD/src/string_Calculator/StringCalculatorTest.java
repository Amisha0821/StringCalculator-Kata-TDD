package string_Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void emptyStringReturnZero() {
		assertEquals(0,StringCalculator.add(""));
	}

	@Test
	public void stringReturnOne() {
		assertEquals(1,StringCalculator.add("1"));
	}

}
