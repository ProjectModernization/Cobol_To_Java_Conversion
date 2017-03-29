package siddarth.learn.assignment2;

public class Assignment2 {

	public Assignment2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;


		System.out.println("*************************************************************");
		System.out.println("-------------------------------PROGRAM ONE-------------------------------");
		Iterif itr = new Iterif();
		for(int i=1;i<=3;i++){
			result=itr.iteration_if();			
		}
		System.out.println("*************************************************************");
		System.out.println("-------------------------------PROGRAM TWO-------------------------------");
		Perform1 per = new Perform1();
		per.TopLevel();
		
		System.out.println("*************************************************************");
		System.out.println("-------------------------------PROGRAM THREE-------------------------------");
		conditions cond = new conditions();
		cond.checkChar();
		System.out.println("*************************************************************");
	}

}
