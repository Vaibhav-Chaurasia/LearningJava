package Java0014OopsConceptInheritance;

public class InheritanceHierarchicalInheritance {

	public static void main(String args[]){  
		Cat c = new Cat();  
		c.meow();  
		c.eat();  
		//c.bark();//C.T.Error  
	}
}

class Animalll{  
	void eat(){
		System.out.println("eating...");
	}  
}  

class Doggg extends Animalll{  
	void bark(){
		System.out.println("barking...");
	}  
}  

class Cat extends Animalll{  
	void meow(){
		System.out.println("meowing...");
	}  
}