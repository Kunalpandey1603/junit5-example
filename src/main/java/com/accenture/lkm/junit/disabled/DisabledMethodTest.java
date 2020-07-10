package com.accenture.lkm.junit.disabled;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledMethodTest {
	@Disabled
	@Test
	public void testConcatWithNullInput() {
		String st1 = "Hello";
		String st2 = "World";
		String st3 = null;
		String expect = st1 + st2;
		String actual = st2 + st3;
		assertEquals(expect, actual);
	}
}
