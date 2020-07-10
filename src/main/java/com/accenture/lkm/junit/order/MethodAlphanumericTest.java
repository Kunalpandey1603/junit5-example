package com.accenture.lkm.junit.order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//Alphanumeric OrderAnnotation Custom Order
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class MethodAlphanumericTest {

	@Test
	void testZeta() {
		assertEquals(2, 1 + 1);
	}

	@Test
	void testAlpha() {
		assertEquals(2, 1 + 1);
	}

	@Test
	void testGamma() {
		assertEquals(2, 1 + 1);
	}

	@Test
	void testBeta() {
		assertEquals(2, 1 + 1);
	}

}
