package Java0019Strings;

public class MethodToCharArray {

	public static void main(String[] args) {

		/*-------------------------------------------------------------------------------------------*/
		//To Char Array Example
		String s1="hello";  
		char[] ch = s1.toCharArray();  
		for(int i = 0; i < ch.length; i++){  
			System.out.print(ch[i]);  
		}
		/*-------------------------------------------------------------------------------------------*/
		
		
		
		/*-------------------------------------------------------------------------------------------*/
		//It is useful method which returns char array from the string without writing any custom code.
		String s2 = "Welcome to Javatpoint";  
        char[] ch1 = s2.toCharArray();  
        int len = ch1.length;  
        System.out.println("Char Array length: " + len);  
        System.out.println("Char Array elements: ");  
        for (int i = 0; i < len; i++) {  
            System.out.println(ch1[i]);  
        }
		/*-------------------------------------------------------------------------------------------*/
	}
}
