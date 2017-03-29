package siddarth.learn.TestCases.Junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import siddarth.learn.assignment2.Iterif;
import siddarth.learn.assignment2.Perform1;
import siddarth.learn.assignment2.conditions;

public class Assignment2TestPart1 {
	@Test
	public void testPrintMessage()
	{
		System.out.println("Suite Test1 is executing");

		Iterif itr = new Iterif();
		itr.iteration_if();
		assertEquals(3, itr.getNumber1());
		assertEquals(3, itr.getNumber2());
		if(itr.getOpted()=="*"){
			assertEquals("+",itr.getOpted());
			assertEquals(6, itr.getResult());
		}
		else if (itr.getOpted()=="*"){
			assertEquals("*",itr.getOpted());
			assertEquals(9, itr.getResult());
		}
		
		

	}
}
