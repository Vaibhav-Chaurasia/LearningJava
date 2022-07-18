package Java0016OopsConceptPolymorphism;

public class FinalMethodInheritance extends Bike2 {
	public static void main(String args[]){  
		new FinalMethodInheritance().run();  
	}
}

class Bike2{  
	final void run(){
		System.out.println("running...");
	}  
}