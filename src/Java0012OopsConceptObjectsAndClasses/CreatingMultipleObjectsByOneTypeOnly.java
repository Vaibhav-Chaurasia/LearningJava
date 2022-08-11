package Java0012OopsConceptObjectsAndClasses;

public class CreatingMultipleObjectsByOneTypeOnly {

	int length;  
	int width;

	public static void main(String args[]){  
		CreatingMultipleObjectsByOneTypeOnly r1 = new CreatingMultipleObjectsByOneTypeOnly(),
				r2 = new CreatingMultipleObjectsByOneTypeOnly(); //creating two objects  

		r1.insert(11, 5);  
		r2.insert(3, 15);  

		r1.calculateArea();  
		r2.calculateArea();  
	}

	void insert(int l, int w){  
		length = l;
		width = w;
	}  

	void calculateArea(){
		System.out.println(length * width);
	}
}