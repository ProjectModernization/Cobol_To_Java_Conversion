package siddarth.learn.assignment1;

import java.util.Scanner;

public class Multiplier {


	int  number1,number2,answer;
	public void Multiplier() {
		// TODO Auto-generated constructor stub


		System.out.println("Enter BOTH THE NUMBER 1  and NUMBER 2 ");
		Scanner scanner = new Scanner(System.in);
		number1 = scanner.nextInt();
		number2=scanner.nextInt();
		answer=number1*number2;
		System.out.println("The multiplication of "+ number1+ "and"+ number2 + "is "+answer);
		System.out.println("********************************************************");
		System.out.println("PROGRAM 3");
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}




}
