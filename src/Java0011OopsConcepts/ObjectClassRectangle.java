package Java0011OopsConcepts;

public class ObjectClassRectangle {

	int length;  
	int width;  
	void insert(int l, int w){  
		length=l;  
		width=w;  
	}
	void calculateArea(){
		System.out.println(length*width);
	}

}

class TestRectangle1{  
	public static void main(String args[]){  
		ObjectClassRectangle r1=new ObjectClassRectangle();  
		ObjectClassRectangle r2=new ObjectClassRectangle();  
		
		r1.insert(11,5);  
		r2.insert(3,15);  
		
		r1.calculateArea();  
		r2.calculateArea();  
	}  
}
