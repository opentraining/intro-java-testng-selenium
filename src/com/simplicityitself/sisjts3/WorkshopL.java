package com.simplicityitself.sisjts3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WorkshopL {
	
	@Test(dataProvider = "nameProvider")
	public void task1(String searchName) {

		List people = new ArrayList();
		
		people.add("David");
		people.add("Robert");
		people.add("Jacob");
		people.add("Beth");
		people.add("Celia");
		people.add("Cheryl");
		
		assertTrue(people.contains(searchName));
	}
	

	@DataProvider(name = "nameProvider")
	public Object[][] createData1() {
	 return new Object[][] { 
			 {"Cedric"}, {"Anne"} };
	}

}
