package com.vstl.collection;

import java.util.Hashtable;

public class HashTableExample {

	public Hashtable<String, Integer> getStudentExampDetails() {
		
		Hashtable<String, Integer> objHashtable = new Hashtable<String, Integer>();
	   
		try {
			 objHashtable.put("Rohini", 80);
			    objHashtable.put("Rani", 82);
			    objHashtable.put("Rohan", 73);
			    objHashtable.put("Swati", 84);
			    objHashtable.put("Shweta", 71);

			    System.out.println("Student Details :" +objHashtable.toString());			
			    
		} catch (Exception e) {
			System.out.println("Exception:" +e.getMessage());
			e.getMessage();
		}
		return objHashtable;
	}
}
