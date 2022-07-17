package Java0013OopsConceptEncapsulation1;

import Java0012OopsConceptEncapsulation.EncapsulationProtectedClass;

/*The protected access modifier is accessible within package and outside the package but through inheritance only.

The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.

It provides more accessibility than the default modifer.


Example of protected access modifier
In this example, we have created the two packages pack and mypack. 
The A class of pack package is public, so can be accessed from outside the package. 
But msg method of this package is declared as protected, so it can be accessed 
from outside the class only through inheritance.
 * */

public class EncapsulationProtectedClass2 extends EncapsulationProtectedClass {
	public static void main(String args[]){  
		EncapsulationProtectedClass2 obj = new EncapsulationProtectedClass2();  
		obj.msg();  
	}
}