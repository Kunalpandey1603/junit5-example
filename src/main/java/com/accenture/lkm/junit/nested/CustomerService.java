package com.accenture.lkm.junit.nested;

import java.util.List;

public class CustomerService {

	public void findOneById(long l) {
		System.out.println("findOneById");
	}

	public void findOneByName(long l) {
		System.out.println("findOneByName");
	}

	public void findAllByIds(List<Integer> asList) {
		System.out.println(asList);
	}

	public void findOneByName(String string) {
		System.out.println(string);
	}

	public void findOneByNameRegex(String string) {
		System.out.println(string);

	}

}
