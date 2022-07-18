package Java0016OopsConceptPolymorphism;

public class OverloadingAmbiguityByChangingReturnTypeOnly {

	public static void main(String[] args){  
		System.out.println(Adder2.add1(11, 11));//ambiguity  
	}

}

class Adder2{
	static int add1(int a,int b){
		return a+b;
	}

	static double add1(int a,int b){
		return a+b;
	}  
}
