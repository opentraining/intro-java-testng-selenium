package com.simplicityitself.sisjts3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WorkshopB {

	@Test
	public void task1() {

		int answer = 0;

		assertEquals(answer, 17);
	}

	@Test
	public void task2() {

		int answer = 7;

		assertEquals(answer, 17);
	}

	@Test
	public void task3() {

		int answer = 7;

		assertEquals(answer, 21);
	}

	@Test
	public void task4() {

		int initial = 10;

		int answer = 7;

		assertEquals(answer, 17);

	}

	@Test
	public void task5() {
		String greeting = "Hello ";
		String person = "Everyone";

		String answer = "";

		assertEquals(answer, "Hello Everyone");
	}

	@Test
	public void task6() {
		String greeting = "Hello ";
		String person = "Everyone";
		int age = 5;

		String answer = "";

		assertEquals(answer, "Hello Everyone 15");
	}

}
