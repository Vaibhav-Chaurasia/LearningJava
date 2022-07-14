package Java0007Operators;

public class AssignmentOperator {
	
	public static void main(String[] args) {
		int a=10;  
		int b=20;  
		a+=4;//a=a+4 (a=10+4)  
		b-=4;//b=b-4 (b=20-4)  
		System.out.println(a);  
		System.out.println(b);  
		
		
		int c=10;  
		c+=3;//10+3  
		System.out.println(c);  
		c-=4;//13-4  
		System.out.println(c);  
		c*=2;//9*2  
		System.out.println(c);  
		c/=2;//18/2  
		System.out.println(c);  
		c%=2;
		System.out.println(c);
		
		
		//short d=10;  
		//short e=10;  
		//d+=e;//d=d+e internally so fine  
		//d=d+e;//Compile time error because 10+10=20 now int  
		//System.out.println(a);  
		
		//After type cast:
		short d=10;  
		short e=10;  
		d=(short)(d+e);//20 which is int now converted to short  
		System.out.println(d);  
	}

}
