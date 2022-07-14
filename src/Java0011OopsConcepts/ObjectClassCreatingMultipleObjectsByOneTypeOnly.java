package Java0011OopsConcepts;

public class ObjectClassCreatingMultipleObjectsByOneTypeOnly {

	int length;  
	int width;  

	void insert(int l,int w){  
		length=l;  
		width=w;  
	}  

	void calculateArea(){System.out.println(length*width);}  
}

class TestRectangle2{  
	public static void main(String args[]){  
		ObjectClassCreatingMultipleObjectsByOneTypeOnly r1=new ObjectClassCreatingMultipleObjectsByOneTypeOnly(),
				r2=new ObjectClassCreatingMultipleObjectsByOneTypeOnly();//creating two objects  
		
		r1.insert(11,5);  
		r2.insert(3,15);  
		
		r1.calculateArea();  
		r2.calculateArea();  
	}  
} 