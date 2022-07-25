package Java0023Conversion;

public class WrapperAutoBoxing {
	public static void main(String args[]){  

		//Converting int into Integer  
		int a=20;  
		Integer i = Integer.valueOf(a); //converting int into Integer explicitly  
		Integer j = a; //auto boxing, now compiler will write Integer.valueOf(a) internally  

		System.out.println(a + " " + i + " " + j);  
	}
}