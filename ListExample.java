package com.vstl.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {

    public List<Integer> getStudentMarkList() {
		
    	    //Array List
		List<Integer> objList = new ArrayList<Integer>();
		objList.add(85);
		objList.add(87);
		objList.add(80);
		objList.add(77);
		objList.add(90);
		objList.add(69);
		objList.add(70);
		objList.add(88);
	//	objList.add("Rani");     /It will not take bcz it's string
				
		System.out.println("The List is :" +objList);
		System.out.println("The size is :" +objList.size());
		
		return objList;
    }
          
         //Hash Set
    public Set<Integer> getUniqueMarkList() {
        Set<Integer> objSet = new HashSet<Integer>();
        objSet.add(85);
        objSet.add(87);
        objSet.add(80);
        objSet.add(77);
        objSet.add(90);
        objSet.add(69);
        objSet.add(70);
        objSet.add(88);
        objSet.add(70);
        
        System.out.println("The List :" +objSet);
		return objSet;
    }
}
