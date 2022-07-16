package Java0014OopsConceptInheritance;

public class InheritanceMultilevelInheritance {
	
	public static void main(String args[]){  
		BabyDog d = new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  
	}
}

class Animall{  
	void eat(){
		System.out.println("eating...");
	}  
}

class Dogg extends Animal{  
	void bark(){
		System.out.println("barking...");
	}  
}

class BabyDog extends Dogg{  
	void weep(){
		System.out.println("weeping...");
	}  
}