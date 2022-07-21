package Java0011MethodsCreatingAndCalling;

public class CreatingAndCallingMethodsMulitpleTimes {
	
	static void myMethod() {
		System.out.println("I just got executed!");
	}

	public static void main(String[] args) {
		myMethod();
		myMethod();
		myMethod();
	}
}