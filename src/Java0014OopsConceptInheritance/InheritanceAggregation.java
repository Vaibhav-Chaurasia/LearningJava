package Java0014OopsConceptInheritance;

public class InheritanceAggregation {
	public static void main(String[] args) {  
		Addresse address1=new Addresse("gzb","UP","india");
		Addresse address2=new Addresse("gno","UP","india");

		Emp e = new Emp(111, "varun", address1);
		Emp e2 = new Emp(112, "arun", address2);

		e.display();
		e2.display();
	}
}

class Addresse {  
	String city,state,country;  

	public Addresse(String city, String state, String country) {  
		this.city = city;  
		this.state = state;  
		this.country = country;  
	}
}


class Emp {  
	int id;  
	String name;  
	Addresse address;  

	public Emp(int id, String name, Addresse address) {  
		this.id = id;  
		this.name = name;  
		this.address=address;  
	}  

	void display(){  
		System.out.println(id+" "+name);
		System.out.println(address.city+" " + address.state + " " + address.country);
	}  


}