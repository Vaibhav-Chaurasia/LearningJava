package Java0016OopsConceptAbstraction;

public class InterfaceStaticMethodExample {
	public static void main(String args[]){  
		Drawable2 d = new Rectangle2();  
		d.draw();

		System.out.println(Drawable2.cube(3));  
	}
}

interface Drawable2{  
	void draw();  

	static int cube(int x){
		return x * x * x;
	}  
}

class Rectangle2 implements Drawable2{  
	public void draw(){
		System.out.println("drawing rectangle");
	}  
}