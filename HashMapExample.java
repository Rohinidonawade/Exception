package com.vstl.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public Map<String, String> getEmployeeDetails() {
		Map<String, String> objHashMap = new HashMap<String, String>();
		
			objHashMap.put("FirstName", "Rohini");
			objHashMap.put("LastName", "Donawade");
			objHashMap.put("CompanyName", "VSTL");
			objHashMap.put("Designation", "Test-Engineer");
			objHashMap.put("Location", "Pune");
			
			System.out.println("The Data :" +objHashMap);		
		return objHashMap;
	}
}
