package demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	@AfterTest
	public void lastExecution()
	{
		System.out.println("Last Execute");
	}
	@Test
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test
	public void test3()
	{
		System.out.println("test 3");
	}
	
	

}
