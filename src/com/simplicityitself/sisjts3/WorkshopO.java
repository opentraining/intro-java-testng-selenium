package com.simplicityitself.sisjts3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WorkshopO {
	
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
		//this rather clumsy syntax creates a 2 dimensional array that TestNG then uses to map onto the parameters.
		//Would've been better to use a java.util.Map. 
	 return new Object[][] { 
			 {"Cedric"}, {"Anne"} };
	}

}
