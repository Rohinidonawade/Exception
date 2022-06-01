package com.vstl.exceptionHandling;

public class JavaExceptionHandling {

	//Arithmetic Exception
	
	public void calculation(int intNumeratorValue) {
	
		try {
			int intDenominator = 0;
			int Result;
			Result = intNumeratorValue/intDenominator;
			System.out.println("The result :" +Result);
			if(Result>0);
			System.out.println("I got result");
			
		} catch(ArithmeticException arithmeticException) {
		  System.out.println("Exception :" +arithmeticException.getMessage());	
		  arithmeticException.printStackTrace();

		}
	}

		
		//NullpointerException
		public void getEmployeeDetails() {
			try {
				String strName = null;
			    System.out.println("Employee name :" +strName.length());
								
			} catch (NullPointerException nullPointerException) {
				System.out.println("Exception :" +nullPointerException.getMessage());
				nullPointerException.printStackTrace();
			}
		}
	
		//Numberformate Exception
		public void getMobileNumber() {
			
			try {
				String strMobileNumber = "Indian Number";
				int intConverted = Integer.parseInt("Indian");
				System.out.println("Mobile number :"+intConverted);
				
			} catch (NumberFormatException numberFormatException) {
				System.out.println("Exception :" +numberFormatException.getMessage());
				numberFormatException.printStackTrace();
			}
		}
		
		//ArrayIndexoutof Bound Exception
		public void getEmployeeName() {
			
			try {				
					String strArray[] = {"Rohini","Priya","Chaitali","Aditi","Shivani","Ekta","Deepika","Swapnil"};
					System.out.println("The 10th employee name :" +strArray[0].length());
					if(strArray[10].length()>0);
					System.out.println("Display all employee names");
				
			} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
				System.out.println("Exception:"+arrayIndexOutOfBoundsException.getMessage());
				arrayIndexOutOfBoundsException.printStackTrace();
			}				
		}
		
		//StringIndexoutof Bound Exception
		public void getCompanyName() {
			
			try {
				String strName = "Verve Square Technology";			
				System.out.println("The 29th letter is :" +strName.charAt(30));					
	
			} catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
				System.out.println("Exception :" +stringIndexOutOfBoundsException.getMessage());
				stringIndexOutOfBoundsException.printStackTrace();
			}
		}			
}
