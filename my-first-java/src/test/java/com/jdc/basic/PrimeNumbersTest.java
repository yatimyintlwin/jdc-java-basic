package com.jdc.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PrimeNumbersTest {

	@ParameterizedTest
	@CsvSource(value = {
			"1,false",
			"2,true",
			"3,true",
			"4,false",
			"5,true",
			"6,false",
			"7,true",
			"8,false",
			"9,false"
	})
	void test_prime(int value, boolean expected) {
		var result = PrimeNumbers.isPrimeNumber(value);
		assertEquals(expected, result);
	}
}
