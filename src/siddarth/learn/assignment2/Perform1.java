package com.learn.assignment2;

public class Perform1 {

	public Perform1() {
		// TODO Auto-generated constructor stub
	}
	public void TopLevel() 
	{
		System.out.println("In TopLevel. Starting to run program");
		OneLevelDown();
		System.out.println("Back in TopLevel.");
	}
	public void TwoLevelsDown() 
	{
		System.out.println(">>>>>>>> Now in TwoLevelsDown.");
		ThreeLevelsDown();
		System.out.println(">>>>>>>> Back in TwoLevelsDown.");
	}
	public void OneLevelDown() 
	{
		System.out.println(">>>> Now in OneLevelDown");
		TwoLevelsDown();
		System.out.println(">>>> Back in OneLevelDown");
	}
	public void ThreeLevelsDown() 
	{
		System.out.println(">>>>>>>>>>>> Now in ThreeLevelsDown");
	}
}
