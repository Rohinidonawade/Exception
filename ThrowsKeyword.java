package com.vstl.exceptionHandling;

public class ThrowsKeyword {

	//Throws keyword:- we doesn't want to handle the exception &try to send the exception to the JVM.
	
	public void getDivisibleValue() {
		int intAddtionValue = 100;
		int intTotallValue = 0;
		int intResult = intAddtionValue/intTotallValue;
		System.out.println("Result :" +intResult);
		
		throw new ArithmeticException();			
      }
	
     public void getCalculationResult(){
       try{
    	   getDivisibleValue();
	 
      }catch (ArithmeticException arithmeticException) {
	     System.out.println("Exception" +arithmeticException.getMessage());
       }
   }
}
