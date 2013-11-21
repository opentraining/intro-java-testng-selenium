package com.simplicityitself.sisjts3;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WorkshopF {
	
	
	@Test
	public void task1() {

		//create a new array
		String[] values = null;
		
		//set values into the array here.
		
		assertEquals(values[0], "hello");
		assertEquals(values[3], "world");
	}
	
	@Test
	public void task2() {

		//create a new list
		List values = null;
		
		//set values into the list here.
		
		assertEquals(values.get(0), "hello");
		assertEquals(values.get(4), "world");
	}
	
	@Test
	public void task3() {

		//create a new Map
		Map values = null;
		
		//set values into the map here.
		
		assertEquals(values.get("first word"), "hello");
		assertEquals(values.get("second word"), "world");
	}
}
