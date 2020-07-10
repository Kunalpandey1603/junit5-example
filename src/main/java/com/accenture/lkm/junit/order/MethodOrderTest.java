package com.accenture.lkm.junit.order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderTest {

	@Test
	void testMethodOne() {
		assertEquals(2, 1 + 1);
	}

	@Test
	@Order(3)
	void testMethodTwo() {
		assertEquals(2, 1 + 1);
	}

	@Test
	@Order(1)
	void testMethodThree() {
		assertEquals(2, 1 + 1);
	}

	@Test
	@Order(2)
	void testMethodFour() {
		assertEquals(2, 1 + 1);
	}

}
