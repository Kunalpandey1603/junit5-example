package com.accenture.lkm.junit.assumption;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Examples of Assumptions in Junit 5")
public class Assumptions {
	@Test
	@DisplayName("Basic assumptions")
	void testAssumeFalse() {
		System.setProperty("DB", "UAT");
		assumeFalse("UAT".equals(System.getProperty("DB")));
		// remainder of code will be aborted
		System.out.println("testAssumeFalse");
	}

	@Test
	void testAssumeTrue() {
		System.setProperty("DB", "Live");
		assumeTrue("Live".equals(System.getProperty("DB")));
		// remainder of code will be executed
		System.out.println("testAssumeTrue");

	}

	@Test
	void testAssumingThat() {

		// run these assertions always, just like normal test
		assertEquals(2, 1 + 1);

		assumingThat("DEV".equals(System.getenv("APP_MODE")), () -> {
			// run this only if assumingThat condition is true
			assertEquals(2, 1 + 1);
		});

		// run these assertions always, just like normal test
		assertEquals(2, 1 + 1);

	}

}