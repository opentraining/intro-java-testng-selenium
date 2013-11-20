package com.simplicityitself.sisjts3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WorkshopG {
	
	@Test
	public void task1A() {

		List people = new ArrayList();
		
		people.add("David");
		people.add("Robert");
		people.add("Jacob");
		people.add("Beth");
		people.add("Celia");
		people.add("Cheryl");
		
		assertTrue(people.contains("David"));
		assertTrue(people.contains("Jacob"));
		
		Collections.sort(people);
		
		assertEquals(people.get(0),"Beth");
	}
	
	@Test
	public void task1b() {

		String testName = nameGenerator("David", 25);
		
		assertTrue(testName.contains("is an adult, and should be allowed to make decisuns"));
		assertTrue(testName.contains("David"));
		
		testName = nameGenerator("Gergory", 14);
		
		assertFalse(testName.contains("is an adult, and should be allowed to make decisuns"));
		assertTrue(testName.contains("Gregory"));
	}

	
	String nameGenerator(String name, int age) {
		if (age > 18) {
			return name + " is an adult, and should be allowed to make decisuns"; 	
		}
		return name + " is " + age;
	}
}
