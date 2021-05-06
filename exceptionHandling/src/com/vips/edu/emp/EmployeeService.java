package com.vips.edu.emp;
public class EmployeeService {
	private String employees[] = {"101001011", "102001022", "103002011", "104003080", "105002020", "106002080"};
	/*
	* Note : employee codes are designed in following way:
	* a) first 3 digits are employee code
	* b) next 3 digits are related to their department id.
	* c) and last 3 digits are the city code of their work location
	* for example
	* 011 : Delhi
	* 022 : Mumbai
	* 080 : Banglore
	* 020 : Pune
	* */
	
	public String[] getEmployeeCodes()
	{
		String codes[] = new String[employees.length];
		int count = -1;
		for (String empid : employees) {
			codes[++count] = empid.substring(0, 3);
		}
		return codes;
	}

	public String[] getEmployeePinCodes() {
	    String pincodes[] = new String[employees.length];
		int count = -1;
		for (String empid : employees) {
			pincodes[++count] = empid.substring(6, 9);
		}
		return pincodes;
	}
	
	public void getPinCodeLocation(String pin) throws EmployeeException {
	    String[] pinCode = {"011", "020", "022", "080"};
	    String[] location = {"Delhi", "Pune", "Mumbai", "Banglore"};
	    int ind = -1;
	    for(int i = 0; i < pinCode.length; i++) {
	        if(pinCode[i].equals(pin)) {
	            ind = i;
	            break;
	        }
	    }
	    if(ind != -1)
		{
			 // book the tickets 
			System.out.println("Location is: " + location[ind]);
		}
		else
		{
			// raised the exception
			throw new EmployeeException(" Cannot Find pincode ");
		}
	}
}//end