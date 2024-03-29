package Java0017OopsConceptPolymorphism;

public class OverloadingChangingDataTypesOfArguments {
	
	/*In this example, we have created two methods that differs in data type
. The first add method receives two integer arguments and second add method receives two double arguments.
	 * */

	public static void main(String[] args){  
		System.out.println(Adder1.add(11, 11));  
		System.out.println(Adder1.add(12.3, 12.6));  
	}
}

class Adder1{
	static int add(int a, int b){
		return a + b;
	}

	static double add(double a, double b){
		return a + b;
	}
}