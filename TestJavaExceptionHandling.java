package com.vstl.exceptionHandling;

public class TestJavaExceptionHandling {

	private Object intResult;

	public static void main(String[] args) throws Exception {

		JavaExceptionHandling objExceptionHandling = new JavaExceptionHandling();
		objExceptionHandling.calculation(400);
System.out.println("*******************");

		objExceptionHandling.getEmployeeName();
System.out.println("*******************");
		
		objExceptionHandling.getMobileNumber();
System.out.println("*******************");

		objExceptionHandling.getEmployeeDetails();
System.out.println("*******************");
		
		objExceptionHandling.getCompanyName();
System.out.println("*******************");
		
	
              //ThrowsKeyword
		ThrowsKeyword objThrowsKeyword = new ThrowsKeyword();
		objThrowsKeyword.getCalculationResult();
System.out.println("*******************");
		
		
		ThrowKeyword objThrowKeyword = new ThrowKeyword();		 
		objThrowKeyword.eligibilityForVote(16);
	}	
} 


