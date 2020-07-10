package com.accenture.lkm.junit.conditional;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class SystemPropertyTest {

	@Test
	@EnabledIfSystemProperty(named = "java.class.version", matches = "52.0")
	void onJavaClassVersion() {
		System.out.println("Run this on java class version");
	}

	@Test
	@EnabledIfSystemProperty(named = "user.country", matches = "US")
	void onCountryUSA() {
		System.out.println("Run this on country code US");
	}

	@Test
	void printSystemProperties() {
		Properties properties = System.getProperties();
		System.out.println(properties.get("java.vm.name"));
		properties.forEach((k, v) -> System.out.println(k + ":" + v));
	}

}