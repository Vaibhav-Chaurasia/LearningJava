package Java0007Operators;

public class UnaryOperator {
	
	public static void main(String[] args) {
		
		//Java Unary Operator Example: ++ and --
		int x = 10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
		
		//Java Unary Operator Example: ++ and --
		int a = 10;  
		int b = 10;  
		System.out.println(a++ + ++a); //10+12=22  
		System.out.println(b++ + b++); //10+11=21
		System.out.println(b++ - b++);
		System.out.println(b-- - --b);
		
		
		//Java Unary Operator Example: ~ and !
		int a1 = 10;  
		int b1 =- 10;  
		boolean c = true;  
		boolean d = false;  
		System.out.println(~a1); //-11 (minus of total positive value which starts from 0)  
		System.out.println(~b1); //9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true  
	}

}