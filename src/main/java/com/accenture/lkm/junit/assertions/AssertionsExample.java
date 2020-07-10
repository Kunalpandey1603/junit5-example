package com.accenture.lkm.junit.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Assertion Examples Class")
class AssertionsExample {

	@DisplayName("Assertion equals, not null ,not same")
	@Test
	public void testStringIntAssertions() {
		// test data
		String sValue1 = new String("Junit5");
		String sValue2 = new String("Junit5");
		String sValue3 = null;
		String sValue4 = "Junit5";
		String sValue5 = "Junit5";

		int iValue1 = 100;
		int iValue2 = 200;

		// Validate two strings are equal
		Assertions.assertEquals(sValue1, sValue2);
		// overloaded method with failure message
		Assertions.assertEquals(sValue1, sValue2, "Values are not equal");

		// Validate condition is true
		Assertions.assertTrue(iValue1 < iValue2);
		// overloaded method with failure message
		Assertions.assertTrue(iValue1 < iValue2, "Condition is False");

		// Validate condition is false
		Assertions.assertFalse(iValue1 > iValue2);

		// Validate object is not null
		Assertions.assertNotNull(sValue1);

		// Validate object is null
		Assertions.assertNull(sValue3);

		// Validate if two objects are same
		Assertions.assertSame(sValue4, sValue5);

		// Validate if two objects are not same
		Assertions.assertNotSame(sValue1, sValue3);

		// // Assert all
		Assertions.assertAll("numbers", () -> Assertions.assertEquals(sValue1, "Junit5"),
				() -> Assertions.assertEquals(sValue2, "Junit5"));
		// to check failure conditions

		// Assertions.assertAll("numbers", () -> Assertions.assertEquals(sValue1,
		// "abs"),
		// () -> Assertions.assertEquals(sValue2, "xyz"));

	}

	@DisplayName("Assertion arrays")
	@Test
	public void testArraysAssertions() {
		String array1[] = { "bus", "car", "bike" };
		String array2[] = { "bus", "car", "bike" };

		Assertions.assertArrayEquals(array1, array2);

	}

}
