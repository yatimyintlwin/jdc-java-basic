package com.jdc.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

	private Calculator calc;

	@BeforeEach
	void beforeEach() {
		calc = new Calculator();
	}

	@ParameterizedTest
	@CsvSource(value = {
		"1,5,6",
		"10,3,13",
		"-1,10,9"
	})
	void test_add(int digit1, int digit2, int expected) {

		var result = calc.add(digit1, digit2);

		assertEquals(expected, result);
	}
}
