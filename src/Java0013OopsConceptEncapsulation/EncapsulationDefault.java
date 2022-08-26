package Java0013OopsConceptEncapsulation;

import Java0014OopsConceptEncapsulation1.EncapsulationDefault1;

/* If you don't use any modifier, it is treated as default by default. 
 * The default modifier is accessible only within package. 
 * It cannot be accessed from outside the package. It provides more accessibility than private. 
 * But, it is more restrictive than protected, and public.

Example of default access modifier

In this example, we have created two packages Java0013OopsConceptEncapsulation and Java0014OopsConceptEncapsulation1. 
We are accessing the EncapsulationDefault1 class from outside its package, since EncapsulationDefault class is not public, 
so it cannot be accessed 
from outside the package.
 * */

//See Java0013OopsConceptEncapsulation1 folder.
class EncapsulationDefault {
	public static void main(String args[]){  
		EncapsulationDefault1 obj = new EncapsulationDefault1(); //Compile Time Error  
		obj.msg(); //Compile Time Error  
	}
}