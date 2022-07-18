package Java0016OopsConceptPolymorphism;

public class BindingDynamic extends Animal1{
	void eat(){
		System.out.println("dog is eating...");
	}  

	public static void main(String args[]){  
		Animal1 a = new BindingDynamic();  
		a.eat();  
	}
}

class Animal1{  
	void eat(){
		System.out.println("animal is eating...");
	}  
}


/*
 *In the above example object type cannot be determined by the compiler, 
 *because the instance of Dog is also an instance of Animal.
 *So compiler doesn't know its type, only its base type.
 */