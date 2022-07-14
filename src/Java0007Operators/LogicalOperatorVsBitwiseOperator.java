package Java0007Operators;

public class LogicalOperatorVsBitwiseOperator {

	public static void main(String[] args) {

		/*The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.
		   The bitwise & operator always checks both conditions whether first condition is true or false.*/
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a < b && a < c);//false && true = false (Logical Operator)
		System.out.println(a < b & a < c);//false & true = false  (Bitwise Operator)


		int d=10;  
		int e=5;  
		int f=20;  
		System.out.println(d < e && d++ < f);//false && true = false  (Logical Operator)
		System.out.println(d);//10 because second condition is not checked  (Logical Operator)
		System.out.println(d < e & d++ < f);//false && true = false  (Bitwise Operator)
		System.out.println(d);//11 because second condition is checked (Bitwise Operator)


		/*The logical || operator doesn't check the second condition if the first condition is true. It checks the second condition only if the first one is false.
		  The bitwise | operator always checks both conditions whether first condition is true or false.*/
		int g=10;  
		int h=5;  
		int i=20;  
		System.out.println(g > h || g < i);//true || true = true  (Logical Operator)
		System.out.println(g > h | g < i);//true | true = true  (Bitwise Operator)
		
		//|| vs |  
		System.out.println(g > h || g++ < i);//true || true = true (Logical Operator)
		System.out.println(g);//10 because second condition is not checked  (Logical Operator)
		System.out.println(g > h | g++ < i);//true | true = true (Bitwise Operator)
		System.out.println(g);//11 because second condition is checked  (Bitwise Operator)
		
		
		//Logical Not Operator
		int x = 10, y = 1;
		 
        System.out.println("Var1 = " + x);
        System.out.println("Var2 = " + y);
 
        // Using logical NOT operator
        System.out.println("!(x < y) = " + !(x < y));
        System.out.println("!(x > y) = " + !(x > y));
	}

}
