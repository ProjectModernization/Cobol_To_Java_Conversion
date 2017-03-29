package com.learn.TestCases.Junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.learn.assignment2.Iterif;
import com.learn.assignment2.Perform1;
import com.learn.assignment2.conditions;

public class Assignment2TestPart2 {
	@Test
	public void testPrintMessage()
	{
		System.out.println("Test Case 2  is executing");
		conditions cond = new conditions();
		cond.checkChar();
		assertEquals("a",cond.getCh());
	}
}
