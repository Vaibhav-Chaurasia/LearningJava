package Java0011OopsConceptObjectsAndClasses;

public class MethodRectangleExample {

	int length;  
	int width;  
	void insert(int l, int w){  
		length = l;  
		width = w;  
	}

	public static void main(String args[]){  
		MethodRectangleExample r1 = new MethodRectangleExample();  
		MethodRectangleExample r2 = new MethodRectangleExample();  

		r1.insert(11,5);  
		r2.insert(3,15);  

		r1.calculateArea();  
		r2.calculateArea();  
	} 

	void calculateArea(){
		System.out.println(length * width);
	}
}