package Java0022Miscellaneous;

public class CallByValueIfOriginalValueRemainsUnchanged {
	
	/*In case of call by value original value is not changed.*/
	
	int data = 50;  

	void change(int data){  
		data = data + 100; //changes will be in the local variable only  
	}  

	public static void main(String args[]){  
		CallByValueIfOriginalValueRemainsUnchanged op = new CallByValueIfOriginalValueRemainsUnchanged();  

		System.out.println("before change " + op.data);  

		op.change(500);  
		
		System.out.println("after change " + op.data);  
	}
}