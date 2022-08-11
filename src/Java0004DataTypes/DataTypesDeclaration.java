package Java0004DataTypes;

public class DataTypesDeclaration {

	public static void main(String[] args) {

		/*Primitive Data Types*/
		boolean one = false;
		System.out.println(one);

		byte a = 10;
		byte b = -20;
		System.out.println(a);
		System.out.println(b);

		short c = 10000;
		short d = -5000;
		System.out.println(c);
		System.out.println(d);

		int e = 100000;
		int f = -200000;
		System.out.println(e);
		System.out.println(f);

		long g = 100000L;
		long h = -200000L;
		System.out.println(g);
		System.out.println(h);

		float f1 = 234.5f;
		System.out.println(f1);

		double d1 = 12.3;
		System.out.println(d1);

		char letterA = 'A';
		System.out.println(letterA);


		/*Non - Primitive Data Types*/
		String s = "vaibhav";
		System.out.println(s);

		//declaration and instantiation  of Array
		int array[] = new int[5];

		//initialization
		array[0] = 10;  
		array[1] = 20;  
		array[2] = 70;  
		array[3] = 40;  
		array[4] = 50;

		//length is the property of array
		for(int j = 0; j < array.length; j++)  {
			System.out.println(array[j]);  
		}
	}
}