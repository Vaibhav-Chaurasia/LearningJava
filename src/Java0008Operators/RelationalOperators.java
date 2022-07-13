package Java0008Operators;

public class RelationalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int c = a + b;

		//Equal to
		if(c == 30) {
			System.out.println("Value is equal to 30.");
		}

		//Greater than or equal to
		if(a >= 30) {
			System.out.println("Value is greater than or equal to 30.");
		}
		
		//Less than or equal to
		if(b <= 20) {
			System.out.println("Value is less than or equal to 20.");
		}
		
		//Greater than
		if(a > 9) {
			System.out.println("Value is greater than 9.");
		}
		
		//Less than
		if(b < 21) {
			System.out.println("Value is less than 20.");
		}
		
		//Not Equal to
		if(c != 21) {
			System.out.println("Value is not equal to 30.");
		}


	}

}
