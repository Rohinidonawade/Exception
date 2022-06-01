package com.vstl.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestListExample {

	public static void main(String[] args) {
         
		        //HashList
		ListExample objExample = new ListExample();
		
		List<Integer> studentList = objExample.getStudentMarkList();
		System.out.println("Remove 3rd Array :" +studentList.remove(4));
		System.out.println("5th array :" +studentList.get(5));
		System.out.println("Data:" +studentList.add(60));
		System.out.println("Equal value:" +studentList.equals(55));
		
		
System.out.println("**********************");
		
		        //HashSet
	    Set<Integer> unique = objExample.getUniqueMarkList();
	    System.out.println("The list:" +unique.add(5));
	    System.out.println("The list:" +unique);
	    System.out.println("The list:" +unique.removeAll(unique));
	    System.out.println("The list:" +unique.size());
	    
System.out.println("**********************");

	            //HashTable
	    HashTableExample objHashTableExample = new HashTableExample();
		Hashtable<String,Integer> student = objHashTableExample.getStudentExampDetails();
        System.out.println("Data:" +student.get("Rohini"));
        System.out.println("All data:" +student.replace("Rohan", 80));
        System.out.println("Display new data:"+student.toString());
        
System.out.println("**********************");

		        //HashMap
        HashMapExample objHashMapExample = new HashMapExample();
		Map<String, String> employee=objHashMapExample.getEmployeeDetails();
		System.out.println("The Data :" +employee.get("FirstName"));
		System.out.println("size of the List:" +employee.size());
	
System.out.println("**********************");
 
                //LinkedList
       LikedListExample objLikedListExample = new LikedListExample();
       List<String> bank = objLikedListExample.getBankList();
       System.out.println("The 3rd Bank :" +bank.get(3));
       System.out.println("Data:" +bank.get(2).indexOf("k"));
       
System.out.println("**********************");

               //LinkedHashSet
       LinkedHashSetExample objLinkedHashSetExample = new LinkedHashSetExample();
       Set<Integer> marks = objLinkedHashSetExample.getMarks();
       System.out.println("Size of list:" +marks.size());
       System.out.println("Data contains 55:" +marks.contains(55));
       System.out.println("Add 99 to data:" +marks.add(99));
       System.out.println("Data:" +marks.toString());

	}
}
