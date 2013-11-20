package com.simplicityitself.sisjts3;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class WorkshopD {
	
	@Test
	public void task1() {

		int answer = 0;

		answer = answer + 2;
		answer = answer + 2;
		answer = answer + 2;
		answer = answer + 2;
		answer = answer + 2;
		answer = answer + 2;
		
		//replace this with a while loop
		
		assertEquals(answer, 12);
	}
	
	@Test
	public void task2() {

		int answer = 0;
		
		for (int i = 0; i < 10; i = i + 1) {
			//enter the correct line here to add all the values of i together.
			
		}
		//0+1+2+3+4+5+6+7+8+9 == 45
		assertEquals(answer, 45);
	}
	
	@Test
	public void task3() {
		String answer = "";
		
		//create a for loop that generates the text below
		
		assertEquals(answer, "10987654321");
	}
}
