package com.simplicityitself.sisjts3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WorkshopC {

	@Test
	public void task1() {

		boolean answer = false;

		assertTrue(answer);
	}

	@Test
	public void task2() {

		int a = 17;
		int b = 17;

		boolean answer = false;

		assertTrue(answer);
	}

	@Test
	public void task3() {

		String a = "Value 1";
		String b = "Something Different";

		boolean answer = true;

		assertFalse(answer);
	}

	@Test
	public void task4() {
		String value = "Hello";

		int answer = 25;

		if (answer < 15) {
			value = "Thats right!";
		}

		assertEquals(value, "Thats right!");
	}

	@Test
	public void task5() {
		String value = "Hello";

		int answer = 25;

		if (answer > 15) {
			value = "Thats wrong!";
		} else {
			value = "Thats right!";
		}

		assertEquals(value, "Thats right!");
	}

	@Test
	public void task6() {
		String value = "Hello";

		int answer = 25;

		if (answer > 15) {
			value = "Thats wrong!";
		} else if (answer < 7) {
			value = "Thats right!";
		}

		assertEquals(value, "Thats right!");
	}

	@Test
	public void task7() {
		String answer = "Hello";

		int value = 25;

		switch (value) {
		case 25:
			answer = "Nope, not this";
			break;
		case 17:
			answer = "Nope, not this, either";
			break;
		case 4:
			answer = "Thats right!";
			break;
		}

		assertEquals(value, "Thats right!");
	}
	
	@Test
	public void task8() {
		
		String value = "Hello";
		int otheranswer = 35;
		int answer = 25;

		//enter the if here

		assertEquals(value, "Thats right!");
	}

}
