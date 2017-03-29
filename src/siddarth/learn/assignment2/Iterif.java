package siddarth.learn.assignment2;

import java.util.Scanner;

public class Iterif {

	int Number1,Number2, result = 0;
	String opted;
	public Iterif() {
		// TODO Auto-generated constructor stub
	}

	public int iteration_if() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter the First Number:");
		Number1= scanner.nextInt();
		System.out.println("Enter the Second Number:");
		Number2= scanner.nextInt();
		System.out.println("Enter operator (+ or *) :");
		opted= scanner.next();

		switch(opted) {
		case "+" :
			result=Number1+Number2;
			System.out.println("Result is "+result); 
			break;
		case "*" :
			result=Number1*Number2;
			System.out.println("Result is "+result);
			break;
		default :
			System.out.println("Invalid grade");
		}
		return result;
	}

	public int getNumber1() {
		return Number1;
	}

	public void setNumber1(int number1) {
		Number1 = number1;
	}

	public int getNumber2() {
		return Number2;
	}

	public void setNumber2(int number2) {
		Number2 = number2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getOpted() {
		return opted;
	}

	public void setOpted(String opted) {
		this.opted = opted;
	}

}
