package Java0017OopsConceptPolymorphism;

public class RuntimePolymorphismWithDataMember extends Bike3{
	int speedlimit = 150;  

	public static void main(String args[]){  
		Bike3 obj=new RuntimePolymorphismWithDataMember();  
		System.out.println(obj.speedlimit);//90
	}
}

class Bike3{  
	int speedlimit=90;  
}