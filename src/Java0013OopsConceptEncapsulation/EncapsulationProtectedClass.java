package Java0013OopsConceptEncapsulation;

/*The protected access modifier is accessible within package and outside the package but through inheritance only.

The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.

It provides more accessibility than the default modifer.


Example of protected access modifier
In this example, we have created two packages Java0013OopsConceptEncapsulation and Java0014OopsConceptEncapsulation1.
The EncapsulationProtectedClass class of pack package is public, so can be accessed from outside the package. 
But msg method of this package is declared as protected, so it can be accessed 
from outside the class only through inheritance.
 * */

//Now, see another folder Java0013OopsConceptEncapsulation1
public class EncapsulationProtectedClass {
	protected void msg(){
		System.out.println("Hello");
	}
}