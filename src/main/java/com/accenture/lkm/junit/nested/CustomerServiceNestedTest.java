package com.accenture.lkm.junit.nested;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Test Customer Service")
public class CustomerServiceNestedTest {

	static CustomerService customerService;

	@BeforeAll
	static void beforeAll() {
		customerService = new CustomerService();
	}

	// Create one customerService object and reuse for all the nested tests
	@Test
	@DisplayName("new CustomerService() for all the nested methods.")
	void createNewObjectForAll() {
		System.out.println("New CustomerService()");

	}

	@Nested
	@DisplayName("findOne methods")
	class FindOne {
		@Test
		void findOne_with_id() {
			customerService.findOneById(2L);
		}

		@Test
		void findWith_with_name() {
			customerService.findOneByName(2L);
		}

		@Test
		void findWith_with_name_regex() {
			customerService.findOneByNameRegex("%s");
		}
	}

	@Nested
	@DisplayName("findAll methods")
	class FindAll {
		@Test
		void findAll_with_ids() {
			customerService.findAllByIds(Arrays.asList(2, 3, 4));
		}

		@Test
		void findAll_with_name_likeY() {
			customerService.findOneByName("mkyong");
		}
	}

}