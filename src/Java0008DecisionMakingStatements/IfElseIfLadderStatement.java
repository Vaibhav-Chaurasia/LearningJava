package Java0008DecisionMakingStatements;

public class IfElseIfLadderStatement {

	public static void main(String[] args) {

		String city = "Delhi";  

		if(city == "Meerut") {  
			System.out.println("city is meerut");  
		}

		else if (city == "Noida") {  
			System.out.println("city is noida");  
		}

		else if(city == "Agra") {  
			System.out.println("city is agra");  
		}

		else {  
			System.out.println(city);  
		}




		//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.  
		int marks = 65;

		if(marks < 50){  
			System.out.println("fail");  
		}  

		else if(marks >= 50 && marks < 60){  
			System.out.println("D grade");  
		}  

		else if(marks >= 60 && marks < 70){  
			System.out.println("C grade");  
		}  

		else if(marks >= 70 && marks < 80){  
			System.out.println("B grade");  
		}  

		else if(marks >= 80 && marks < 90){  
			System.out.println("A grade");  
		}

		else if(marks >= 90 && marks < 100){  
			System.out.println("A+ grade");  
		}

		else{  
			System.out.println("Invalid!");  
		}  



		//Program to check POSITIVE, NEGATIVE or ZERO
		int number =- 13;    

		if(number > 0){  
			System.out.println("POSITIVE");  
		}

		else if(number < 0){  
			System.out.println("NEGATIVE");  
		}

		else{  
			System.out.println("ZERO");  
		}  
	}
}