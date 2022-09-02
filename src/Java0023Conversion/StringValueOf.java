package Java0023Conversion;

public class StringValueOf {

	/*
	 * The java string valueOf() method converts different types of values into string. 
	 * By the help of string valueOf() method, you can convert int to string, long to string, 
	 * boolean to string, character to string, float to string, double to string, 
	 * object to string and char array to string.
	 * */

	//Java String valueOf() method example converting int to String
	public static void main(String args[]){
		
		/*-------------------------------------------------------------------------------------------------*/
		int value = 30;  
		String s1 = String.valueOf(value);  
		System.out.println(s1+10); //concatenating string with 10
		/*-------------------------------------------------------------------------------------------------*/
		
		
		/*-------------------------------------------------------------------------------------------------*/
		//Java String valueOf(boolean bol) Method Example
		boolean bol = true;
        boolean bol2 = false;
        String s2 = String.valueOf(bol);
        String s3 = String.valueOf(bol2);
        System.out.println(s2);
        System.out.println(s3);
        /*-------------------------------------------------------------------------------------------------*/
        
        
        
        /*-------------------------------------------------------------------------------------------------*/
        //Java String valueOf(char ch) Method Example
        char ch1 = 'A';
        char ch2 = 'B';
        String s4 = String.valueOf(ch1);
        String s5 = String.valueOf(ch2);
        System.out.println(s4);
        System.out.println(s5);
        /*-------------------------------------------------------------------------------------------------*/
        
        
        
        /*-------------------------------------------------------------------------------------------------*/
        //Java String valueOf(float f) and valueOf(double d)
        float f  = 10.05f;
        double d = 10.02;
        String s6 = String.valueOf(f);
        String s7 = String.valueOf(d);
        System.out.println(s6);
        System.out.println(s7);
        /*-------------------------------------------------------------------------------------------------*/
        
        
        
        /*-------------------------------------------------------------------------------------------------*/
        //Java String valueOf() Complete Examples
        boolean b1 = true;  
        byte b2 = 11;    
        short sh = 12;  
        int i = 13;  
        long l = 14L;  
        float f1 = 15.5f;  
        double d1 = 16.5d;  
        char chr[]={'j','a','v','a'};  
        
        StringValueOf obj = new StringValueOf();  
        String s8 = String.valueOf(b1);    
        String s9 = String.valueOf(b2);    
        String s10 = String.valueOf(sh);    
        String s11 = String.valueOf(i);    
        String s12 = String.valueOf(l);    
        String s13 = String.valueOf(f1);    
        String s14 = String.valueOf(d1);    
        String s15 = String.valueOf(chr);    
        String s16 = String.valueOf(obj);    
        
        System.out.println(s8);  
        System.out.println(s9);  
        System.out.println(s10);  
        System.out.println(s11);  
        System.out.println(s12);  
        System.out.println(s13);  
        System.out.println(s14);  
        System.out.println(s15);  
        System.out.println(s16);
        /*-------------------------------------------------------------------------------------------------*/
	}
}