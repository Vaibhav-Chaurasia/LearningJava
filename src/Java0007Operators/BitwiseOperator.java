package Java0007Operators;

public class BitwiseOperator {
	
	public static void main(String[] args) {
		int x = 5, y = 7;   //declaring values  
		
		// bitwise XOR     
		// 0101 ^ 0111 = 0101 = 2    
		// Performing an operation with xor and traditional operator   
		System.out.println("x ^ y = " + (x ^ y));
		
		//Complement Operator
		int  a  =  8 ; 
        System.out.println("a  =  "  +  a); 
       
        int  b  =  ~a; 
        System.out.println ("b  =  "  +  b); 
	}
}