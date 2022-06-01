package com.vstl.collection;

import java.util.LinkedList;
import java.util.List;

public class LikedListExample {

	public List<String> getBankList() {
		
		List<String> objList = new LinkedList<String>();
		objList.add("HDFC");
		objList.add("ICIC");
		objList.add("Kotak");
		objList.add("SBI");
		
		System.out.println("Data :" +objList.toString());
		System.out.println("The 3rd Bank is :" +objList.get(3));
	
		return objList;		
	}
}
