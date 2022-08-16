package Java0017OopsConceptPolymorphism;

public class OverloadingWithTypePromotionIfFoundMatching {

	void sum(int a, int b){
		System.out.println("int arg method invoked");
	}

	void sum(long a, long b){
		System.out.println("long arg method invoked");
	}

	public static void main(String args[]){  
		OverloadingWithTypePromotionIfFoundMatching obj = new OverloadingWithTypePromotionIfFoundMatching();  

		obj.sum(20, 20); //now int arg sum() method gets invoked  
	}
}