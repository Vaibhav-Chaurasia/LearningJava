package Java0017OopsConceptPolymorphism;

public class BindingStatic {
	@SuppressWarnings("unused")
	private void eat(){
		System.out.println("dog is eating...");
	}  

	public static void main(String args[]){  
		Dog d1=new Dog();  
		d1.eat();  
	}  
}