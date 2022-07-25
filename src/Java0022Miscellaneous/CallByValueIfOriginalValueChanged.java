package Java0022Miscellaneous;

public class CallByValueIfOriginalValueChanged {

	int data = 50;  

	void change(CallByValueIfOriginalValueChanged op){  
		op.data = op.data + 100; //changes will be in the instance variable  
	}  


	public static void main(String args[]){  
		CallByValueIfOriginalValueChanged op = new CallByValueIfOriginalValueChanged();  

		System.out.println("before change " + op.data);  

		op.change(op);//passing object  

		System.out.println("after change " + op.data);
	}
}
