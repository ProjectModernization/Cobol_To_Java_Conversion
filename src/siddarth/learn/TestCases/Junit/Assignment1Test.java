package siddarth.learn.TestCases.Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import siddarth.learn.assignment1.Display;
import siddarth.learn.assignment1.Multiplier;
import siddarth.learn.assignment1.StudentsInfo;

public class Assignment1Test {

	@Test
	public void StudentDetailJunitTesting() {
		//This is the input for Junit_TestCase Testing SIDDARTMANOJREDVR1992M
		StudentsInfo stud = new StudentsInfo();
		stud.StudentsInfo();
		assertEquals("VR", stud.getStudent_Initial());
		assertEquals("MANOJRED", stud.getStudent_Name());
		assertEquals("M", stud.getStudent_gender());
		Multiplier mul = new Multiplier();
		mul.Multiplier();
		assertEquals(3, mul.getNumber1());
		assertEquals(3, mul.getNumber2());
		assertEquals(9, mul.getAnswer());
		Display disply = new Display();
		disply.Display();
		assertEquals("I did it",disply.getDisp());
	}

}
