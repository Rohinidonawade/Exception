package com.vstl.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public Set<Integer> getMarks() {
		Set<Integer> objSet = new LinkedHashSet<Integer>();
		objSet.add(10);
		objSet.add(20);
        objSet.add(30);
		objSet.add(40);
		objSet.add(50);
		objSet.add(50);

		System.out.println("Data:"+objSet);
		return objSet;	
		
	}
}
