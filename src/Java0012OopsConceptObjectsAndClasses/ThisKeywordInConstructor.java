package Java0012OopsConceptObjectsAndClasses;

public class ThisKeywordInConstructor {

	public static void main(String args[]){  
		Student5 s1 = new Student5(111, "ankit", "java");  
		Student5 s2 = new Student5(112, "sumit", "java", 6000f);  
		
		s1.display();  
		s2.display();  
	}
}

class Student5{  
	int rollno;  
	String name,course;  
	float fee;  
	
	Student5(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
	}

	Student5(int rollno, String name, String course, float fee){  
		this(rollno, name, course);//reusing constructor  
		this.fee = fee;  
	}

	void display(){
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}  
}
