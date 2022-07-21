package Java0011MethodsCreatingAndCalling;

public class ReturningTypeMethod {
	
	static int myMethod(int x) {
		return 5 + x;
	}

	public static void main(String[] args) {
		System.out.println(myMethod(3));
	}
}