package Java0016OopsConceptAbstraction;

public class InterfaceDefaultMethodExample {
	public static void main(String args[]){  
		Drawable1 d = new Rectangle1();  
		d.draw();  
		d.msg();  
	}
}

interface Drawable1{

	void draw();

	default void msg(){
		System.out.println("default method");
	}
}

class Rectangle1 implements Drawable1{  
	public void draw(){
		System.out.println("drawing rectangle");
	}
} 