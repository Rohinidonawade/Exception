package com.vstl.exceptionHandling;

public class ThrowKeyword {

		
		//throw :-is used to throw the user defined exception object to JVM explicitly for the purpose we will use throw keyword.
	public void eligibilityForVote(int intAge) throws Exception{
		
		if(intAge<18) {
			throw new ArithmeticException("Not eligible");
		}
		else {
			System.out.println("Eligible for Vote");
	    }
		try {
			eligibilityForVote(Integer.parseInt(null));
		} catch (Exception exception) {
			System.out.println("Exception:" +exception.getMessage());
		}	
	}		
}

