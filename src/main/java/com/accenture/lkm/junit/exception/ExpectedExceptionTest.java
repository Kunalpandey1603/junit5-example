package com.accenture.lkm.junit.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpectedExceptionTest {
	@Test
	void testExpectedException() {

		Assertions.assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("One");
		});

	}

	@Test
	void testExpectedExceptionWithSameType() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Integer.parseInt("One");
		});
	}

	@Test
	void testExpectedExceptionFail() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Integer.parseInt("1");
		});

	}

}
