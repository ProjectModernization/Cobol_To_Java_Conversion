package siddarth.learn.assignment1;

import org.junit.runner.notification.StoppedByUserException;

public class Display {
	String disp ;
	public void Display() {
		// TODO Auto-generated constructor stub

		disp = "I did it";

		System.out.println(disp);
		System.out.println("********************************************************");
	}
	public String getDisp() {
		return disp;
	}
	public void setDisp(String disp) {
		this.disp = disp;
	}

}
