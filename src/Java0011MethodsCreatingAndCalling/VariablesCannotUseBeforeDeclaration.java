package Java0011MethodsCreatingAndCalling;

public class VariablesCannotUseBeforeDeclaration {
	public static void main(String[] args) {

		// Code here CANNOT use x

		int x = 100;

		// Code here can use x
		System.out.println(x);
	}
}