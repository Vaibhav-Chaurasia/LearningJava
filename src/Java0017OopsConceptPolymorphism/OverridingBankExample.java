package Java0017OopsConceptPolymorphism;

/*Consider a scenario where Bank is a class that provides 
 * functionality to get the rate of interest. However, the rate of interest varies according to banks. 
 * For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.
 * */

public class OverridingBankExample {
	public static void main(String args[]){  
		SBI s = new SBI();  
		ICICI i = new ICICI();  
		AXIS a = new AXIS();  
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());  
	}
}


//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  
class Bank{  
	int getRateOfInterest(){
		return 0;
	}  
}

//Creating child classes.  
class SBI extends Bank{
	int getRateOfInterest(){
		return 8;
	}  
}  

class ICICI extends Bank{  
	int getRateOfInterest(){
		return 7;
	}  
}

class AXIS extends Bank{  
	int getRateOfInterest(){
		return 9;
	}  
}