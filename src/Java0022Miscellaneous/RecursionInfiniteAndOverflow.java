package Java0022Miscellaneous;

public class RecursionInfiniteAndOverflow {
	static void p(){  
		System.out.println("hello");  
		p();  
	}  

	public static void main(String[] args) {  
		p();  
	}
}